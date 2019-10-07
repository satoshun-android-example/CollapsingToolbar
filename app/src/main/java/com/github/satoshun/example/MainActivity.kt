package com.github.satoshun.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.satoshun.example.databinding.MainActBinding
import com.github.satoshun.example.databinding.MainItemBinding
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import com.xwray.groupie.databinding.BindableItem

class MainActivity : AppCompatActivity() {

  private lateinit var binding: MainActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.main_act)
    setSupportActionBar(binding.toolbar)

    with(binding.recycler) {
      layoutManager = LinearLayoutManager(this@MainActivity)
      adapter = MainAdapter()
    }
  }
}

class MainAdapter : GroupAdapter<ViewHolder>() {
  init {
    update(
      (0..100).map { MainItem() }
    )
  }
}

class MainItem : BindableItem<MainItemBinding>() {
  override fun getLayout(): Int = R.layout.main_item

  override fun bind(viewBinding: MainItemBinding, position: Int) {
  }
}
