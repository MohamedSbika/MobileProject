package com.example.projet_semestriel_android

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projet_semestriel_android.databinding.ActivityAboutBinding

class about : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button12.setOnClickListener {
            var i: Intent = Intent(this,SuiteActivity3::class.java)
            startActivity(i)
        }
    }
}