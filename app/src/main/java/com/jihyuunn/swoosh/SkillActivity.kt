package com.jihyuunn.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SkillActivity : AppCompatActivity() {

    val league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_avtivity)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

}
