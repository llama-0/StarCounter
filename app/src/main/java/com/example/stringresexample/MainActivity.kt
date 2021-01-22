package com.example.stringresexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.stringresexample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private var counter: Int = 0
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        countStarts()
    }

    private fun countStarts() {
        binding?.btnCount?.setOnClickListener {
            counter++
            setText(counter)
        }
    }

    private fun setText(counter: Int) {
        val numberOfStars: String = resources.getQuantityString(R.plurals.numberOfStars, counter, counter)
        binding?.tvCounter?.text = numberOfStars
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}