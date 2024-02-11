package com.example.projet_semestriel_android

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.projet_semestriel_android.databinding.ActivityNourritureBinding

class NourritureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nourriture)
        val binding = ActivityNourritureBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button11.setOnClickListener {
            var i= Intent(this,SuiteActivity3::class.java)
            startActivity(i)
        }
        binding.button10.setOnClickListener {
            if(binding.editTextText2.text.toString().isNotEmpty() ) {
                val intent = Intent(this,ProgrammeActivity::class.java)
                intent.putExtra("bmi",binding.editTextText2.text.toString().toDouble())
                startActivity(intent)
            }else
                Toast.makeText(this,"enter a value!",
                    Toast.LENGTH_LONG).show()
    }
    }
}