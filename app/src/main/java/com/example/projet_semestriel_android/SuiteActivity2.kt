package com.example.projet_semestriel_android

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.projet_semestriel_android.databinding.ActivitySuite2Binding

class SuiteActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySuite2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val h = intent.getDoubleExtra("hgt", 0.0)
        val w = intent.getDoubleExtra("wgt", 0.0)
        binding.textView3.text = "%.2f".format(w / (h * h))
        //var i2: Intent =Intent(this,ProgrammeActivity::class.java)

        if (binding.textView3.text.toString().toDouble() > 25.0) {
            binding.textView5.visibility = View.VISIBLE
            binding.textView6.visibility = View.INVISIBLE
            binding.textView7.visibility = View.INVISIBLE
        } else if (binding.textView3.text.toString().toDouble() < 25.0 && binding.textView3.text.toString().toDouble() > 18.0) {
            binding.textView5.visibility = View.INVISIBLE
            binding.textView6.visibility = View.INVISIBLE
            binding.textView7.visibility = View.VISIBLE
        } else {
            binding.textView5.visibility = View.INVISIBLE
            binding.textView6.visibility = View.VISIBLE
            binding.textView7.visibility = View.INVISIBLE
        }
        binding.button7.setOnClickListener {
            var i= Intent(this,SuiteActivity::class.java)

            startActivity(i)
        }
        binding.button8.setOnClickListener {
            val intent= Intent(this,ProgrammeActivity::class.java)
            intent.putExtra("imc", binding.textView3.text.toString().toDouble())
            startActivity(intent)
        }
    }
}
