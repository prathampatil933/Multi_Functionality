package com.example.multi_functionality

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class DetailFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.detail_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val itemId = arguments?.getLong(ARG_ITEM_ID) ?: -1
        val textView = view.findViewById<TextView>(R.id.text_view) // Correctly reference TextView
        textView.text = "Item ID: $itemId"
    }

    companion object {
        private const val ARG_ITEM_ID = "itemId"

        fun newInstance(itemId: Long): DetailFragment {
            val fragment = DetailFragment()
            val args = Bundle()
            args.putLong(ARG_ITEM_ID, itemId)
            fragment.arguments = args
            return fragment
        }
    }
}
