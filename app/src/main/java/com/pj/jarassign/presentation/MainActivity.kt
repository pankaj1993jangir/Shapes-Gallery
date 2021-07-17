package com.pj.jarassign.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pj.jarassign.databinding.ActivityMainBinding
import com.pj.jarassign.presentation.images.ImageCarouselActivity
import com.pj.jarassign.presentation.shapes.ShapesActivity

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnImages.setOnClickListener {
            Intent(this, ImageCarouselActivity::class.java).apply {
                startActivity(this)
            }
        }

        binding.btnShapes.setOnClickListener {
            Intent(this, ShapesActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}