package com.jihyuunn.swoosh.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.jihyuunn.swoosh.Model.Player
import com.jihyuunn.swoosh.R
import com.jihyuunn.swoosh.Utility.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill_avtivity.*

class SkillActivity : AppCompatActivity() {

    lateinit var player: Player

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_avtivity)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }

    fun beginnerClicked(view: View) {
        ballerBtn.isChecked = false

        player.skill = "beginner"
    }

    fun ballerClicked(view: View) {
        beginnerBtn.isChecked = false

        player.skill = "baller"
    }

    fun finishClicked(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill", Toast.LENGTH_SHORT).show()
        }
    }


}
