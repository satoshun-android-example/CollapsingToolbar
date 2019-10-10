package com.github.satoshun.example.fadeinout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.satoshun.example.MainAdapter
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.FadeInOutToolbarActBinding
import com.google.android.material.appbar.AppBarLayout

class FadeInOutToolbarActivity : AppCompatActivity() {

  private lateinit var binding: FadeInOutToolbarActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.fade_in_out_toolbar_act)
    setSupportActionBar(binding.toolbar)

    with(binding.recycler) {
      layoutManager = LinearLayoutManager(this@FadeInOutToolbarActivity)
      adapter = MainAdapter()
    }

    binding.appbar.addOnOffsetChangedListener(AppBarLayout.BaseOnOffsetChangedListener<AppBarLayout> { _, verticalOffset ->
      if (verticalOffset == 0) {
        binding.toolbar.setBackgroundColor(
          ContextCompat.getColor(
            this@FadeInOutToolbarActivity,
            android.R.color.transparent
          )
        )
        binding.toolbar.setTitleTextColor(
          ContextCompat.getColor(this@FadeInOutToolbarActivity, android.R.color.white)
        )
        binding.toolbar.navigationIcon?.mutate()?.setTint(
          ContextCompat.getColor(this@FadeInOutToolbarActivity, android.R.color.white)
        )
      } else {
        binding.toolbar.setBackgroundColor(
          ContextCompat.getColor(
            this@FadeInOutToolbarActivity,
            android.R.color.white
          )
        )
        binding.toolbar.setTitleTextColor(
          ContextCompat.getColor(this@FadeInOutToolbarActivity, android.R.color.black)
        )
        binding.toolbar.navigationIcon?.mutate()?.setTint(
          ContextCompat.getColor(this@FadeInOutToolbarActivity, android.R.color.black)
        )
      }
    })
  }
}
