package com.jmzd.ghazal.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.jmzd.ghazal.swoosh.databinding.ActivityLeagueBinding
import com.jmzd.ghazal.swoosh.databinding.ActivityWelcomeBinding

class LeagueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        val binding = ActivityLeagueBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.leagueNextBtn.setOnClickListener{
            val skillActivity = Intent(this, SkillActivity::class.java)
            startActivity(skillActivity)
        }
    }
}