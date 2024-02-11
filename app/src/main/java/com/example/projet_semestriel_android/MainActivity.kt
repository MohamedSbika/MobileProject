package com.example.projet_semestriel_android

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projet_semestriel_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            var i: Intent = Intent(this,SuiteActivity3::class.java)
            startActivity(i)
        }
        binding.button13.setOnClickListener {
            var i: Intent = Intent(this,about::class.java)
            startActivity(i)
        }
    }


}





