package com.example.firstapp.recadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.firstapp.R

class StateRecycler(val context: Context, val list: ArrayList<State>):RecyclerView.Adapter<StateRecycler.MyVH>() {
    class MyVH(ListOfView: View): RecyclerView.ViewHolder(ListOfView){
        val img: ImageView = itemView.findViewById(R.id.state_img)
        val title: TextView = itemView.findViewById(R.id.state_title)
        val state_text: TextView = itemView.findViewById(R.id.state_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StateRecycler.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.state_adapter, parent, false)
        return MyVH(root)
    }

    override fun onBindViewHolder(holder: StateRecycler.MyVH, position: Int) {
        holder.img.setImageResource(list[position].state_img)
        holder.title.setText(list[position].state_title)
        holder.state_text.setText(list[position].state_text)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}