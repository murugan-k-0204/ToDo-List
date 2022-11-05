package com.example.todolist

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val icon : ImageView = findViewById(R.id.taskLogo)
        val sideAnimation = AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_fade_out)

        Handler().postDelayed({
                              startActivity(Intent(this,MainActivity::class.java))
            finish()
        }, 1000)
    }

}