package com.jmzd.ghazal.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jmzd.ghazal.swoosh.EXTRA_PLAYER
import com.jmzd.ghazal.swoosh.R
import com.jmzd.ghazal.swoosh.databinding.ActivityFinishBinding
import com.jmzd.ghazal.swoosh.model.Player


class FinishActivity : AppCompatActivity() {
    lateinit var binding : ActivityFinishBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        binding = ActivityFinishBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
//        val league = intent.getStringExtra(EXTRA_LEAGUE)
//        val skill = intent.getStringExtra(EXTRA_SKILL)

        if (player != null) {
           binding.searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
        }

    }
}