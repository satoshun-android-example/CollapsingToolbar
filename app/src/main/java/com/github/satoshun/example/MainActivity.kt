package com.github.satoshun.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.satoshun.example.databinding.MainActBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: MainActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.main_act)
    setSupportActionBar(binding.toolbar)

    binding.collapsing.setCollapsedTitleTextColor(ContextCompat.getColor(this, android.R.color.white))
    binding.collapsing.setExpandedTitleColor(ContextCompat.getColor(this, android.R.color.white))

//    binding.collapsing.setContentScrimColor(ContextCompat.getColor(this, android.R.color.white))

    with(binding.recycler) {
      layoutManager = LinearLayoutManager(this@MainActivity)
      adapter = MainAdapter()
    }
  }
}
