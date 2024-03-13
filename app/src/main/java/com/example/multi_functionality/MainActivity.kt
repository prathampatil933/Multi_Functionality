package com.example.multi_functionality

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), ItemFragment.OnItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, ItemFragment.newInstance())
            .commit()
    }

    override fun onItemSelected(itemId: Long) {
        val detailFragment = DetailFragment.newInstance(itemId)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, detailFragment)
            .addToBackStack(null)
            .commit()
    }
}
