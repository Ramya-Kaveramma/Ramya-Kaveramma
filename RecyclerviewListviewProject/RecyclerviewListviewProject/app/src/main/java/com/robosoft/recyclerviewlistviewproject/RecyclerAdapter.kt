package com.robosoft.recyclerviewlistviewproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val valuesList: ArrayList<ItemsViewModel>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_item_row, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = valuesList[position]
        holder.namesTv.text = ItemsViewModel.names
        holder.designationTv.text = ItemsViewModel.designation
    }

    override fun getItemCount(): Int {
        return valuesList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val namesTv: TextView = itemView.findViewById(R.id.names)
        val designationTv: TextView = itemView.findViewById(R.id.designation)
    }
}