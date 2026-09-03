package com.vu.nit3213sandboxapp.ui.sessionsix

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vu.nit3213sandboxapp.R
import com.vu.nit3213sandboxapp.data.PhoneDetails
import com.vu.nit3213sandboxapp.network.data.Phone

class PhoneListAdapter(private val dataList: MutableList<Phone> = mutableListOf<Phone>(), val onClickFunction: (PhoneDetails) -> Unit) : RecyclerView.Adapter<PhoneListItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneListItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
                R.layout.phone_item_layout, parent,
                false
            )

        return PhoneListItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: PhoneListItemViewHolder, position: Int) {
        holder.bind(dataList[position], onClickFunction)
    }

    override fun getItemCount() = dataList.size

    fun setData(phoneListData: List<Phone>) {
        dataList.clear()
        dataList.addAll(phoneListData)
        notifyDataSetChanged()
    }
}