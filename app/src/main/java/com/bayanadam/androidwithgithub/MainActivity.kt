 package com.bayanadam.androidwithgithub

import android.media.Image
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

 class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Our first Project on Github

        val text = findViewById<TextView>(R.id.text_view)
        val btn = findViewById<Button>(R.id.btn)
        val image = findViewById<ImageView>(R.id.imge)


    }
}
