package com.github.satoshun.example

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.fadeinout.FadeInOutToolbarActivity

class AppActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.app_act)

    findViewById<View>(R.id.collapsing).setOnClickListener {
      startActivity(
        Intent(this@AppActivity, MainActivity::class.java)
      )
    }

    findViewById<View>(R.id.collapsing2).setOnClickListener {
      startActivity(
        Intent(this@AppActivity, FadeInOutToolbarActivity::class.java)
      )
    }
  }
}
