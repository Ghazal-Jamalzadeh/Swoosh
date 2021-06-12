package com.jmzd.ghazal.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jmzd.ghazal.swoosh.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val binding = ActivityWelcomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
}