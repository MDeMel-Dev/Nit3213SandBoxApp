package com.vu.nit3213sandboxapp.ui.sessionfive

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import com.vu.nit3213sandboxapp.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class AsyncExerciseFragment : Fragment() {

    companion object {
        fun newInstance() = AsyncExerciseFragment()
    }

    private val viewModel: AsyncExerciseFragmentViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_async_exercise, container, false)
    }

    override fun onResume() {
        super.onResume()
        viewModel.updateTextWithDelay()
        lifecycleScope.launch {
            viewModel.labelText.collect { newText ->
                view?.findViewById<TextView>(R.id.exerciseText)?.text = newText
            }
        }
    }
}