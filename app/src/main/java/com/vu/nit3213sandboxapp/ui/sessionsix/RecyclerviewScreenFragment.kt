package com.vu.nit3213sandboxapp.ui.sessionsix

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.vu.nit3213sandboxapp.R
import kotlinx.coroutines.launch

class RecyclerviewScreenFragment : Fragment() {

    companion object {
        fun newInstance() = RecyclerviewScreenFragment()
    }

    private val viewModel: RecyclerviewScreenViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_recyclerview_screen, container, false)

        return view
    }
}