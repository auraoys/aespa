package com.gordon.btslecture

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class aespaActicity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.image_1)
        val image2 = findViewById<ImageView>(R.id.image_2)
        val image3 = findViewById<ImageView>(R.id.image_3)
        val image4 = findViewById<ImageView>(R.id.image_4)

        image1.setOnClickListener {
            Toast.makeText(this,"Krina Rocket Puncher",Toast.LENGTH_LONG).show()

            var intent = Intent(this, aespaActivity2::class.java)
            startActivity(intent)
        }

        image2.setOnClickListener {
            Toast.makeText(this,"Winter Amormentor",Toast.LENGTH_LONG).show()

            var intent = Intent(this, aespaActivity3::class.java)
            startActivity(intent)
        }
        image3.setOnClickListener {
            Toast.makeText(this,"Zijel Got Xenoglossy",Toast.LENGTH_LONG).show()

            var intent = Intent(this, aespaActivity4::class.java)
            startActivity(intent)
        }
        image4.setOnClickListener {
            Toast.makeText(this,"Ning-Ning ED Hacker",Toast.LENGTH_LONG).show()

            var intent = Intent(this, aespaActivity5::class.java)
            startActivity(intent)
        }


    }
}