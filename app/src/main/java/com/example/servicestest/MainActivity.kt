package com.example.servicestest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.servicestest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding.simpleService.setOnClickListener {
            startService(MyService.newIntent(this, 25))
        }
    }
}