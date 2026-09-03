package com.vu.nit3213sandboxapp.ui.sessionsix

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vu.nit3213sandboxapp.R
import com.vu.nit3213sandboxapp.data.PhoneDetails
import com.vu.nit3213sandboxapp.network.data.Phone

class PhoneListItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val textView: TextView = view.findViewById(R.id.phoneItemText)

    fun bind(item: Phone, onClick: (PhoneDetails) -> Unit) {
        textView.text = item.name
        textView.setOnClickListener {
            onClick(PhoneDetails(name = item.name, data = item.data.toString()))
        }
    }
}