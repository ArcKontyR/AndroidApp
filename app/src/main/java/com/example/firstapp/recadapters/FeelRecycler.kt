package com.example.firstapp.recadapters
import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.firstapp.R

class FeelRecycler(val context: Context, val list: ArrayList<Feel>):RecyclerView.Adapter<FeelRecycler.MyVH>() {
    class MyVH(ListOfView: View): RecyclerView.ViewHolder(ListOfView){
        val image: ImageView = itemView.findViewById(R.id.img_feel)
        val textview: TextView = itemView.findViewById(R.id.text_feel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeelRecycler.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.feel_adapter, parent, false)
        return MyVH(root)
    }

    override fun onBindViewHolder(holder: FeelRecycler.MyVH, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.textview.text = list[position].name_feel
    }

    override fun getItemCount(): Int {
        return list.size
    }
}