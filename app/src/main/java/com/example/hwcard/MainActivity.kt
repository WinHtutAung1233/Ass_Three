package com.example.hwcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hwcard.adapter.FoodsAdapter
import com.example.hwcard.model.Foods

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView: RecyclerView = findViewById(R.id.my_cart_recycler)

        var foodArray = ArrayList<Foods>()
        foodArray.add(Foods(R.drawable.hamburger,"Humburger","2000","1"))
        foodArray.add(Foods(R.drawable.rice,"Rice","500","3"))
        foodArray.add(Foods(R.drawable.wine,"Wine","20000","2"))

        val foodsAdapter = FoodsAdapter(foodArray)
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = foodsAdapter

    }
}
