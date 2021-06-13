package com.jmzd.ghazal.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jmzd.ghazal.swoosh.EXTRA_LEAGUE
import com.jmzd.ghazal.swoosh.EXTRA_SKILL
import com.jmzd.ghazal.swoosh.R
import com.jmzd.ghazal.swoosh.databinding.ActivityFinishBinding
import com.jmzd.ghazal.swoosh.databinding.ActivitySkillBinding


class FinishActivity : AppCompatActivity() {
    lateinit var binding : ActivityFinishBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        binding = ActivityFinishBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        binding.searchLeaguesText.text = "Looking for $league $skill league near you..."
    }
}