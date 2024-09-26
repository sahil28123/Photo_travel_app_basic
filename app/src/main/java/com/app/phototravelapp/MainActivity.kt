package com.app.phototravelapp

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var currentImage = 0
    lateinit var image: ImageView
    var places = arrayOf("Kashmir","Goa","Bali", "Jaipur","Taj Mahal")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prev = findViewById<ImageButton>(R.id.btnPrev)
        val next = findViewById<ImageButton>(R.id.btnNext)
        val placeName = findViewById<TextView>(R.id.pName)

        next.setOnClickListener {
            var idCurrentImagestring = "pic$currentImage"

            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImagestring, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (5+currentImage+1)%5
            var idImagetoShowString = "pic$currentImage"
            var idImagetoShowInt = this.resources.getIdentifier(idImagetoShowString, "id", packageName)
            image = findViewById(idImagetoShowInt)
            image.alpha = 1f

            placeName.text = places[currentImage]



        }

        prev.setOnClickListener {
            var idCurrentImagestring = "pic$currentImage"

            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImagestring, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (5+currentImage-1)%5
            var idImagetoShowString = "pic$currentImage"
            var idImagetoShowInt = this.resources.getIdentifier(idImagetoShowString, "id", packageName)
            image = findViewById(idImagetoShowInt)
            image.alpha = 1f

        }

    }
}