package com.jmzd.ghazal.swoosh.controller

import android.content.Intent
import android.os.Bundle
import com.jmzd.ghazal.swoosh.R
import com.jmzd.ghazal.swoosh.databinding.ActivityWelcomeBinding

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val binding = ActivityWelcomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}