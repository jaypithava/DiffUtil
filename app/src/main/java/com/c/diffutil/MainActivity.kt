package com.c.diffutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter=ProgrammingAdapter()

        val p1=ProgrammingItem(1,"j","java")
        val p2=ProgrammingItem(2,"k","kotlin")
        val p3=ProgrammingItem(3,"a","android")
        val p4=ProgrammingItem(4,"s","swift")

        adapter.submitList(listOf(p1,p2,p3,p4))
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter=adapter
        recyclerView.itemAnimator = null;

        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            //p5,p6 id same
            val p5=ProgrammingItem(1,"j","java")
            val p6=ProgrammingItem(2,"jay","Tony")
            val p7=ProgrammingItem(3,"a","android")
            val p8=ProgrammingItem(6,"0","objective-c")

            adapter.submitList(listOf(p5,p6,p7,p8))

        }, 4000)

    }
}