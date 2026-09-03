package com.vu.nit3213sandboxapp.ui.sessionsix

import android.content.Intent
import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.vu.nit3213sandboxapp.R
import com.vu.nit3213sandboxapp.data.PhoneDetails
import com.vu.nit3213sandboxapp.network.data.Phone
import kotlinx.coroutines.launch

class RecyclerviewScreenFragment : Fragment() {

    val recyclerView: RecyclerView? by lazy {
        view?.findViewById(R.id.phoneListRecyclerView)
    }
    private lateinit var adapter: PhoneListAdapter

    companion object {
        fun newInstance() = RecyclerviewScreenFragment()
    }

    private val viewModel: RecyclerviewScreenViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        adapter = PhoneListAdapter(onClickFunction = { phoneDetails -> navigateToPhoneDetailsActivity(phoneDetails)})

        lifecycleScope.launch {
            viewModel.getPhoneListData()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_recyclerview_screen, container, false)

        return view
    }

    override fun onResume() {
        super.onResume()
        lifecycleScope.launch {
            viewModel.phoneList.collect { phoneList ->
                adapter.setData(phoneList)
                recyclerView?.adapter = adapter
            }
        }
    }

    private fun navigateToPhoneDetailsActivity(phoneDetails: PhoneDetails) {
        val navigationIntent = Intent(activity, PhoneDetailsActivity::class.java)
        navigationIntent.putExtra("phoneDetails", phoneDetails)
        startActivity(navigationIntent)
    }
}