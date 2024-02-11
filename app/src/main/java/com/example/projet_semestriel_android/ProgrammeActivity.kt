package com.example.projet_semestriel_android

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.projet_semestriel_android.databinding.ActivityProgrammeBinding

class ProgrammeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_programme)
        val binding = ActivityProgrammeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val imc = intent.getDoubleExtra("imc", 0.0)
        val C = intent.getDoubleExtra("bmi", 0.0)
        //Toast.makeText(this,"imc="+C, Toast.LENGTH_LONG).show()

        if (imc > 25.0) {
            binding.textView11.visibility = View.VISIBLE
            binding.textView12.visibility = View.VISIBLE
            binding.textView10.visibility = View.INVISIBLE
            binding.textView9.visibility = View.INVISIBLE
        } else if (imc <= 25.0 && imc >= 18.0) {
            binding.textView10.visibility = View.VISIBLE
            binding.textView12.visibility = View.VISIBLE
            binding.textView11.visibility = View.INVISIBLE
            binding.textView9.visibility = View.INVISIBLE
        } else {
            binding.textView9.visibility = View.VISIBLE
            binding.textView12.visibility = View.VISIBLE
            binding.textView10.visibility = View.INVISIBLE
            binding.textView11.visibility = View.INVISIBLE
        }
        if ((imc==0.0) ){
       if (C > 25.0){
            binding.textView11.visibility = View.VISIBLE
            binding.textView12.visibility = View.VISIBLE
            binding.textView10.visibility = View.INVISIBLE
            binding.textView9.visibility = View.INVISIBLE
        } else if (C < 25.0 && C > 18.0) {
            binding.textView10.visibility = View.VISIBLE
            binding.textView12.visibility = View.VISIBLE
            binding.textView11.visibility = View.INVISIBLE
            binding.textView9.visibility = View.INVISIBLE
        } else {
            binding.textView9.visibility = View.VISIBLE
            binding.textView12.visibility = View.VISIBLE
            binding.textView10.visibility = View.INVISIBLE
            binding.textView11.visibility = View.INVISIBLE
        }}

        binding.button9.setOnClickListener {
            var i= Intent(this,SuiteActivity3::class.java)
            startActivity(i)
        }
    }
}