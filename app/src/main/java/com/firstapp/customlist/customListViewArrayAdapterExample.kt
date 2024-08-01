package com.firstapp.customlist

import android.graphics.ColorSpace
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class customListViewArrayAdapterExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_list_view_array_adapter_example)

        var listView  = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Snapchat", "Image sharing application", R.drawable.snapchat))
        list.add(Model("LinkedIn", "Professional social application", R.drawable.linkedin))
        list.add(Model("X", "Blog sharing application", R.drawable.x))


        listView.adapter = MyAdapter(this, R.layout.listviewrow, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            if(position == 0) {
                Toast.makeText(applicationContext, "Snapchat", Toast.LENGTH_LONG).show();
            }
        }

    }
}