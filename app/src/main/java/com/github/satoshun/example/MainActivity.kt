package com.github.satoshun.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.main_act.*

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_act)
    setSupportActionBar(toolbar)

    SampleDialogFragment1()
      .show(supportFragmentManager, "test")
  }
}

internal class SampleDialogFragment1 : DialogFragment() {
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(
      R.layout.sample_dialog1,
      container,
      false
    )
  }

  override fun getTheme(): Int {
    return R.style.Widget_AppSample_Dialog_Full
  }
}
