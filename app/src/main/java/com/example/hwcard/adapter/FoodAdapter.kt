package com.example.hwcard.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hwcard.R
import com.example.hwcard.model.Foods
import kotlinx.android.synthetic.main.mycard.view.*

//itemView:View   itemView is name,View is type
//for that input in recycler_view
class FoodsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var foodImg=itemView.findViewById<ImageView>(R.id.img)
    var foodName = itemView.findViewById<TextView>(R.id.food_name)
    var foodPrice = itemView.findViewById<TextView>(R.id.txt_price)
    var foodCount =itemView.findViewById<TextView>(R.id.food_count)
}

//important to extend RecyclerView.Adapter
class FoodsAdapter(var foodsList: ArrayList<Foods>) : RecyclerView.Adapter<FoodsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.mycard, parent, false) //always parent,false
        return FoodsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return foodsList.size
    }

    override fun onBindViewHolder(holder: FoodsViewHolder, position: Int) {

        holder.foodImg.setImageResource(foodsList[position].foodimg)
        holder.foodName.text = foodsList[position].foodname
        holder.foodPrice.text = foodsList[position].foodprice
        holder.foodCount.text = foodsList[position].foodcount
    }

}