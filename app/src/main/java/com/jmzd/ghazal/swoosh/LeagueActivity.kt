package com.jmzd.ghazal.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.jmzd.ghazal.swoosh.databinding.ActivityLeagueBinding
import com.jmzd.ghazal.swoosh.databinding.ActivityWelcomeBinding

class LeagueActivity : BaseActivity() {
    var selectedLeague = "test"
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
        Toast.makeText(this, "${binding.womensLeagueBtn.text}", Toast.LENGTH_SHORT).show()
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
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

    }