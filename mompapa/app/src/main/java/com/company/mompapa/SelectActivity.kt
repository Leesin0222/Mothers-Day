package com.company.mompapa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.company.mompapa.databinding.ActivityMainBinding
import com.company.mompapa.databinding.ActivitySelectBinding

class SelectActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySelectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.letter1.setOnClickListener {
            Toast.makeText(this, "안타깝게 당신은 33.3%의 확률로 꽝입니다.", Toast.LENGTH_SHORT).show()
        }

        binding.letter2.setOnClickListener {
            Toast.makeText(this, "어머니의 편지지를 발견했다!", Toast.LENGTH_SHORT).show()
            val fragment = MomFragment()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.constraint, fragment)
                .commit()
        }

        binding.letter3.setOnClickListener {
            Toast.makeText(this, "아버지의 편지지를 발견했다.", Toast.LENGTH_SHORT).show()
            val fragment = PapaFragment()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.constraint, fragment)
                .commit()
        }
    }
}