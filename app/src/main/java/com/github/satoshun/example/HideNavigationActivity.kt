package com.github.satoshun.example

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

class HideNavigationActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.hide_navigation_act)

    // status bar: hide
    // navigation bar: transparent
//    window.setFlags(
//      WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//      WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
//    )

    // status bar: hide
    // navigation bar: transparent
//    window.setFlags(
//      WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//      WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN
//    )

    // status bar: transparent
    // navigation bar: show
//    window.statusBarColor = ContextCompat.getColor(this, android.R.color.transparent)

    // status bar: transparent
    // navigation bar: show
//    window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
//    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
//    window.statusBarColor = ContextCompat.getColor(this, android.R.color.transparent)

//    // status bar: about black 100 transparent?
//    // navigation bar: show
//    window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
//    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
//    window.statusBarColor = ContextCompat.getColor(this, android.R.color.transparent)

    //    // status bar:
//    // navigation bar:
//    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
//    window.clearFlags(
//      WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
//    )
//    window.statusBarColor = ContextCompat.getColor(this, android.R.color.transparent)

    //    // status bar:
//    // navigation bar:
//    window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
//    window.statusBarColor = ContextCompat.getColor(this, android.R.color.holo_blue_bright)

    //    // status bar:
//    // navigation bar:
//    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
//    window.clearFlags(
//      WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
//    )
//    window.statusBarColor = Color.TRANSPARENT

    //    // status bar:
//    // navigation bar:
//    window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

    // status bar:
    // navigation bar:
//    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
//    window.clearFlags(
//      WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
//    )
//    window.statusBarColor = Color.TRANSPARENT
//    findViewById<View>(R.id.top).fitsSystemWindows = false

//    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
////    window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
//    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
//    window.clearFlags(
//      WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
//    )
//    window.statusBarColor = Color.TRANSPARENT
//    findViewById<View>(R.id.top).fitsSystemWindows = false

    // status bar:
    // navigation bar:
    window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
    window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
    window.statusBarColor = Color.TRANSPARENT
    findViewById<View>(R.id.top).fitsSystemWindows = false

//    window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

//    Handler().postDelayed(1000) {
//      findViewById<View>(R.id.top).fitsSystemWindows = false
//      findViewById<View>(R.id.top).requestApplyInsets()
//    }

    // status bar:
    // navigation bar:
//    window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN)
//    window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
//    window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)

//    window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
//    window.statusBarColor = Color.TRANSPARENT

//    setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false)
//    window.statusBarColor = Color.TRANSPARENT

//    window.setFlags(
//      WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//      WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
//    )
//    window.clearFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
//    window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

//    window.setFlags(
//      WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
//      WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
//    )

//    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
//    window.statusBarColor = Color.TRANSPARENT
//    window.navigationBarColor = Color.BLUE
//    window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

//    window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN)
//    window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
//    window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION)
  }

  private fun setWindowFlag(activity: Activity, bits: Int, on: Boolean) {
    val win = activity.window
    val winParams = win.attributes
    if (on) {
      winParams.flags = winParams.flags or bits
    } else {
      winParams.flags = winParams.flags and bits.inv()
    }
    win.attributes = winParams
  }
}
