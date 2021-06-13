package com.jmzd.ghazal.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.jmzd.ghazal.swoosh.EXTRA_PLAYER
import com.jmzd.ghazal.swoosh.R
import com.jmzd.ghazal.swoosh.databinding.ActivitySkillBinding
import com.jmzd.ghazal.swoosh.model.Player

class SkillActivity : BaseActivity() {
    lateinit var binding: ActivitySkillBinding
    //    var league = ""
    //    var skill = ""
    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        binding = ActivitySkillBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
       // league = intent.getStringExtra(EXTRA_PLAYER).toString()
        player = intent.getParcelableExtra(EXTRA_PLAYER)!!

    }

    fun onBallerClick(view: View) {
        binding.beginnerSkillBtn.isChecked = false
        player.skill = "baller"
    }

    fun onBeginnerClick(view: View) {
        binding.ballerSkillBtn.isChecked = false
        player.skill = "beginner"
    }

    fun onSkillFinishClicked(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
//            finishActivity.putExtra(EXTRA_PLAYER, league)
//            finishActivity.putExtra(EXTRA_PLAYER, skill)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
}