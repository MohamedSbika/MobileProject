package com.example.projet_semestriel_android

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projet_semestriel_android.databinding.ActivitySuite3Binding

class SuiteActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suite3)
        val binding = ActivitySuite3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button6.setOnClickListener {
            var i= Intent(this,MainActivity::class.java)
            startActivity(i)
        }
        binding.button5.setOnClickListener {
            var i= Intent(this,SuiteActivity::class.java)
            startActivity(i)
        }
        binding.button4.setOnClickListener {
            var i= Intent(this,NourritureActivity::class.java)
            startActivity(i)
        }
    }
}