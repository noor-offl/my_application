package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.mylibrary.MyLibrary
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvDisplay.text = MyLibrary().getSquare(7).toString()
        Glide.with(this).load(
            "https://www.floraldesigninstitute.com/assets/images/resources/Flower-Library/Tulip/Tulip-Single-Rounded-299x315.jpg"
        ).into(
            binding.ivImage//findViewById<ImageView>(R.id.ivImage)
        )
        var imageView: ImageView = binding.ivImage
        /*MyLibrary().loadImage(
            this,
            "https://www.floraldesigninstitute.com/assets/images/resources/Flower-Library/Tulip/Tulip-Single-Rounded-299x315.jpg",
            imageView
        )*/


        /*GlobalScope.launch() {
            MyLibrary().loadImage(
                this@MainActivity,
                "https://www.floraldesigninstitute.com/assets/images/resources/Flower-Library/Tulip/Tulip-Single-Rounded-299x315.jpg",
                imageView
            )
        }*/

    }
}