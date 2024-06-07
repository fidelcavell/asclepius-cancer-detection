package com.dicoding.asclepius.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.*
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.asclepius.databinding.ActivitySplashBinding

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            splashLogo.animate().setDuration(2000).alpha(1f).withEndAction {
                val intentMain = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intentMain)
                @Suppress("DEPRECATION")
                overridePendingTransition(
                    R.anim.abc_fade_in,
                    R.anim.abc_fade_out
                )
            }
            splashAppName.animate().setDuration(2000).alpha(1f)
        }
    }
}