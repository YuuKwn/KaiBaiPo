package com.yuukwn.kaibaipo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgPedra = findViewById(R.id.imgPedra) as ImageView

        imgPedra.setOnClickListener{}
    }
}
