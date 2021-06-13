package com.jmzd.ghazal.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.jmzd.ghazal.swoosh.EXTRA_LEAGUE
import com.jmzd.ghazal.swoosh.R
import com.jmzd.ghazal.swoosh.databinding.ActivityLeagueBinding

class LeagueActivity : BaseActivity() {
   var selectedLeague = ""
  //  val player = Player("","")
    lateinit var binding: ActivityLeagueBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        binding = ActivityLeagueBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun onMensClicked(view: View) {
        binding.womensLeagueBtn.isChecked = false
        binding.coedLeagueBtn.isChecked = false

        selectedLeague = "mens"
//        player.league= "mens"
    }

    fun onWomensClicked(view: View) {
        binding.mensLeagueBtn.isChecked = false
        binding.coedLeagueBtn.isChecked = false

       selectedLeague = "womens"
        Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
    }

    fun onCoedClicked(view: View) {
        binding.mensLeagueBtn.isChecked = false
        binding.womensLeagueBtn.isChecked = false

        selectedLeague = "co-ed"
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show()
    }

    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

}