package com.example.projet_semestriel_android

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.projet_semestriel_android.databinding.ActivitySuiteBinding

class SuiteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suite)
        val binding = ActivitySuiteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button2.setOnClickListener {
            if(binding.editTextText.text.toString().isNotEmpty() && binding.editTextText1.text.toString().isNotEmpty()  ) {
                val intent = Intent(this,SuiteActivity2::class.java)
                intent.putExtra("hgt",binding.editTextText.text.toString().toDouble())
                intent.putExtra("wgt",binding.editTextText1.text.toString().toDouble())
                startActivity(intent)
            } else
                Toast.makeText(this,"enter a value!",
                    Toast.LENGTH_LONG).show()
        }
        binding.button3.setOnClickListener {
            var i= Intent(this,SuiteActivity3::class.java)
            startActivity(i)
        }
    }
}