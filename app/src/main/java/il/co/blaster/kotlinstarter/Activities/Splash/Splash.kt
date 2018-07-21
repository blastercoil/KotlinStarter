package il.co.blaster.kotlinstarter.Activities.Splash

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import il.co.blaster.kotlinstarter.Activities.Main.MainActivity
import il.co.blaster.kotlinstarter.R

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        startActivity(Intent(this, MainActivity::class.java))
    }
}
