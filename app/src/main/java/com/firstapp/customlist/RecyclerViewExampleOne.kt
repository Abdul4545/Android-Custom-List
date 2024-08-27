package com.firstapp.customlist

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewExampleOne : AppCompatActivity() {

    private lateinit var arrayList: ArrayList<LinearPojo>
    private lateinit var recyclerView: RecyclerView

    private var adapterRecycler: AdapterRecycler? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler_view_example_one)

        linearListData()
        initRecyclerView()

    }

    private fun initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerViewExample)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        adapterRecycler = AdapterRecycler(this, arrayList)
        recyclerView.adapter = adapterRecycler
    }

    private fun linearListData() {
        arrayList = ArrayList<LinearPojo>()

        arrayList.add(LinearPojo("Android 11", "11"))
        arrayList.add(LinearPojo("Android 10", "10.0"))
        arrayList.add(LinearPojo("Pie", "9.0"))
        arrayList.add(LinearPojo("Oreo", "8.0"))
        arrayList.add(LinearPojo("Nougat", "7.0"))
        arrayList.add(LinearPojo("Marshmallow", "6.0"))
        arrayList.add(LinearPojo("Lollipop", "5.0"))
        arrayList.add(LinearPojo("kitkat", "4.4"))
        arrayList.add(LinearPojo("Jelly Bean", "4.1"))
        arrayList.add(LinearPojo("Ice Cream Sandwich", "4.0"))
        arrayList.add(LinearPojo("Honeycomb", "3.0"))
        arrayList.add(LinearPojo("Gingerbread", "2.3"))
        arrayList.add(LinearPojo("Froyo", "2.2"))
        arrayList.add(LinearPojo("Eclair", "2.0"))
        arrayList.add(LinearPojo("Donut", "1.6"))
        arrayList.add(LinearPojo("Cupcake", "1.5"))
        arrayList.add(LinearPojo("Banana Bread", "1.1"))
        arrayList.add(LinearPojo("Petit Four", "1.0"))
        arrayList.add(LinearPojo("Alpha", "1.0"))

    }
}