package com.robosoft.recyclerviewlistviewproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ListView
import com.google.android.material.snackbar.Snackbar

class ListviewFragment : Fragment(), AdapterView.OnItemClickListener {

    private lateinit var communicator: Communicator

    private lateinit var listadapter: ListviewAdapter
    private lateinit var listView: ListView
    private lateinit var valueArrayList: ArrayList<ItemsViewModel>

    lateinit var names: Array<String>
    lateinit var designation: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_listview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataIntialize()

        listView = view.findViewById(R.id.listview)
        listadapter = ListviewAdapter(valueArrayList)
        listView.adapter = listadapter
        listView.onItemClickListener = this

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

    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        communicator = activity as Communicator

        communicator.passDataCommunicator()
        p1?.let {
            Snackbar.make(
                it,
                "Designation of " + valueArrayList[p2].names + " is " + valueArrayList[p2].designation,
                Snackbar.LENGTH_SHORT
            ).show()
        }
    }
}