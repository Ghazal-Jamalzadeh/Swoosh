package com.jmzd.ghazal.swoosh

import android.os.Bundle
import com.jmzd.ghazal.swoosh.databinding.ActivitySkillBinding

class SkillActivity : BaseActivity() {
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        val binding = ActivitySkillBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)
    }
}