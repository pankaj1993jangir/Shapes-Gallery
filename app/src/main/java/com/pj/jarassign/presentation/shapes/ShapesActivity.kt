package com.pj.jarassign.presentation.shapes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pj.jarassign.databinding.ActivityShapesBinding

class ShapesActivity : AppCompatActivity() {
    lateinit var binding: ActivityShapesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShapesBinding.inflate(layoutInflater)
    }
}