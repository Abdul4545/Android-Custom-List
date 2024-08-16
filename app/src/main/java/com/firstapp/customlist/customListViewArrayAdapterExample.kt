package com.firstapp.customlist

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
<<<<<<< HEAD
        list.add(Model("Abdul Moid", "A B.tech CSE student", R.drawable.snapchat))
=======
        list.add(Model("Abdul Moid", "A B.tech CSE student", R.drawable.moid))
>>>>>>> b5f46f578442f4582d558e3942e65712bc21ae75

        list.add(Model("Snapchat", "Image sharing application", R.drawable.snapchat))
        list.add(Model("LinkedIn", "Professional social application", R.drawable.linkedin))
        list.add(Model("X", "Blog sharing application", R.drawable.x))
<<<<<<< HEAD
        list.add(Model("Abdul Moid", "A B.tech CSE student", R.drawable.snapchat))
=======
        list.add(Model("Abdul Moid", "A B.tech CSE student", R.drawable.moid))
>>>>>>> b5f46f578442f4582d558e3942e65712bc21ae75

        list.add(Model("Snapchat", "Image sharing application", R.drawable.snapchat))
        list.add(Model("LinkedIn", "Professional social application", R.drawable.linkedin))
        list.add(Model("X", "Blog sharing application", R.drawable.x))
<<<<<<< HEAD
        list.add(Model("Abdul Moid", "A B.tech CSE student", R.drawable.snapchat))
=======
        list.add(Model("Abdul Moid", "A B.tech CSE student", R.drawable.moid))
>>>>>>> b5f46f578442f4582d558e3942e65712bc21ae75




        listView.adapter = MyAdapter(this, R.layout.listviewrow, list)

        listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->

//            if(position == 0) {
//                Toast.makeText(applicationContext, "Snapchat", Toast.LENGTH_LONG).show();
//            }
//
//            if(position == 1) {
//                Toast.makeText(applicationContext, "LinkedIn", Toast.LENGTH_SHORT).show();
//            }
//
//            if(position == 2) {
//                Toast.makeText(applicationContext, "X", Toast.LENGTH_SHORT).show();
//            }

            val adapter = listView.adapter as MyAdapter;
            val itemData = adapter.getItem(position) as Model;
            val title = itemData.title

            Toast.makeText(applicationContext, title, Toast.LENGTH_SHORT).show();

        }

    }
}