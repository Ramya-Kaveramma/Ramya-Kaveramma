package com.robosoft.recyclerviewlistviewproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerviewFragment : Fragment() {

    private lateinit var adapter: RecyclerAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var valueArrayList: ArrayList<ItemsViewModel>

    lateinit var names: Array<String>
    lateinit var designation: Array<String>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_recyclerview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataIntialize()

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recyclerview)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = RecyclerAdapter(valueArrayList)
        recyclerView.adapter = adapter
    }

    private fun dataIntialize() {
        valueArrayList = arrayListOf<ItemsViewModel>()

        names = arrayOf(
            getString(R.string.name_1),
            getString(R.string.name_2),
            getString(R.string.name_3),
            getString(R.string.name_4),
            getString(R.string.name_5),
            getString(R.string.name_6),
            getString(R.string.name_7),
            getString(R.string.name_8),
            getString(R.string.name_9),
            getString(R.string.name_10),
            getString(R.string.name_11),
            getString(R.string.name_12),
            getString(R.string.name_13),
            getString(R.string.name_14),
            getString(R.string.name_15),
            getString(R.string.name_16),
            getString(R.string.name_17),
            getString(R.string.name_18),
            getString(R.string.name_19),
            getString(R.string.name_20)
        )

        designation = arrayOf(
            getString(R.string.desg1),
            getString(R.string.desg2),
            getString(R.string.desg3),
            getString(R.string.desg4),
            getString(R.string.desg5),
            getString(R.string.desg5),
            getString(R.string.desg2),
            getString(R.string.desg3),
            getString(R.string.desg4),
            getString(R.string.desg1),
            getString(R.string.desg4),
            getString(R.string.desg3),
            getString(R.string.desg5),
            getString(R.string.desg1),
            getString(R.string.desg2),
            getString(R.string.desg1),
            getString(R.string.desg3),
            getString(R.string.desg4),
            getString(R.string.desg2),
            getString(R.string.desg5)
        )

        for (i in names.indices) {
            val itemsViewModel = ItemsViewModel(names[i], designation[i])
            valueArrayList.add(itemsViewModel)
        }
    }
}