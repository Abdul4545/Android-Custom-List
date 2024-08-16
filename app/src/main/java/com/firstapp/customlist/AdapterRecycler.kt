package com.firstapp.customlist

import android.content.Context
import android.view.LayoutInflater
import android.view.SurfaceHolder
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterRecycler (private val context: Context, private val arrayList: ArrayList<LinearPojo>) :
    RecyclerView.Adapter<AdapterRecycler.MyHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : MyHolder {
            val view =  LayoutInflater.from(context).inflate(R.layout.custom_recycle_list, parent, false)
            return MyHolder(view)
        }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val item = arrayList[position]
        holder.versionName.text = item.versionName
        holder.version.text =item.version
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class MyHolder(view: View): RecyclerView.ViewHolder(view) {
        val versionName: TextView = view.findViewById(R.id.version_name)
        val version: TextView = view.findViewById(R.id.version)
    }
}