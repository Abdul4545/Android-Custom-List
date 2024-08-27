package com.firstapp.customlist

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecycleViewExampleTwo : AppCompatActivity() {

    lateinit var arrayList: ArrayList<GridPojo>
    lateinit var recyclerView: RecyclerView
    var adpterRecycler: AdapterRecyclerTwo? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view_example_two)
        gridListData()
        initRecyclerView()
    }

    private fun initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerViewLinear)
        recyclerView.setHasFixedSize(true)
        val gridLayoutManager = GridLayoutManager(this, 2)
        gridLayoutManager.orientation = RecyclerView.VERTICAL
        recyclerView.setLayoutManager(gridLayoutManager)
        adpterRecycler = AdapterRecyclerTwo(this, arrayList)
        recyclerView.setAdapter(adpterRecycler)
    }

    private fun gridListData() {
        arrayList = ArrayList<GridPojo>()
        arrayList.add(GridPojo("Mobile", R.drawable.ic_launcher_background))
        arrayList.add(GridPojo("Internet", R.drawable.ic_launcher_background))
        arrayList.add(GridPojo("Wifi", R.drawable.ic_launcher_background))
        arrayList.add(GridPojo("Battery", R.drawable.ic_launcher_background))
        arrayList.add(GridPojo("Alarm", R.drawable.ic_launcher_background))
        arrayList.add(GridPojo("Wallpaper", R.drawable.ic_launcher_background))
    }
}