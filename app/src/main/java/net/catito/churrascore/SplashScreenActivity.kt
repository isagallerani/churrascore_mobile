package net.catito.churrascore

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        GlideApp.with(this)
                .load("https://cdn3.iconfinder.com/data/icons/streamline-icon-set-free-pack/48/Streamline-95-512.png")
                .placeholder(R.mipmap.splash)
                .centerCrop()
                .into(imgLogoApp)

        Handler().postDelayed({
            val mainChurrascore = Intent(this, MainActivity::class.java)
            startActivity(mainChurrascore)
            finish()
        }, 2000)
    }

}

