package com.pj.jarassign.presentation.images

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pj.jarassign.databinding.ActivityImageCarouselBinding

class ImageCarouselActivity : AppCompatActivity() {
    lateinit var binding: ActivityImageCarouselBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageCarouselBinding.inflate(layoutInflater)
    }
}