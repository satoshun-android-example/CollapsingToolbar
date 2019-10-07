package com.github.satoshun.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class LightNavigationActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.light_navigation_act)
    setSupportActionBar(findViewById(R.id.toolbar))

    findViewById<View>(R.id.bottom_sheet).setOnClickListener {
      TestBottomSheetDialogFragment()
        .show(supportFragmentManager, "hoge")
    }
  }
}

class TestBottomSheetDialogFragment : BottomSheetDialogFragment() {
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(R.layout.light_navigation_bottom_sheet, container, false)
  }

  override fun getTheme(): Int {
    return R.style.AppTheme_Dialog_LightNavigation
  }
}
