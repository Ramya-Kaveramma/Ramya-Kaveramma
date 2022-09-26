package com.robosoft.recyclerviewlistviewproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListviewAdapter(private val valuesList: ArrayList<ItemsViewModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return valuesList.size
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view =
            LayoutInflater.from(p2?.context).inflate(R.layout.recyclerview_item_row, p2, false)

        val name = view.findViewById<TextView>(R.id.names)
        val designation = view.findViewById<TextView>(R.id.designation)

        name.text = valuesList[p0].names
        designation.text = valuesList[p0].designation

        return view
    }
}