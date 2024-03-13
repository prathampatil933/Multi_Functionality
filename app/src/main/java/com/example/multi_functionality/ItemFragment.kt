package com.example.multi_functionality

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemFragment : Fragment() {

    interface OnItemSelectedListener {
        fun onItemSelected(itemId: Long)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.item_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val items = listOf(Item(1, "Item 1"), Item(2, "Item 2"), Item(3, "Item 3")) // Simulated data

        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view) // Correctly reference RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = ItemAdapter(items)
    }

    companion object {
        fun newInstance() = ItemFragment()
    }
}
