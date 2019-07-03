package com.jihyuunn.swoosh.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.jihyuunn.swoosh.Utility.EXTRA_LEAGUE
import com.jihyuunn.swoosh.R
import com.jihyuunn.swoosh.Utility.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill_avtivity.*

class SkillActivity : AppCompatActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_avtivity)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun beginnerClicked(view: View) {
        ballerBtn.isChecked = false

        skill = "beginner"
    }

    fun ballerClicked(view: View) {
        beginnerBtn.isChecked = false

        skill = "baller"
    }

    fun finishClicked(view: View) {
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill", Toast.LENGTH_SHORT).show()
        }
    }


}
