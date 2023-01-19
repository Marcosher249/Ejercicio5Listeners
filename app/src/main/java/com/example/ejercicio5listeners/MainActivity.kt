package com.example.ejercicio5listeners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.ejercicio5listeners.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    var contador1 = false
    var contador2 = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.editTextTextPersonName.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                cambiar()
            }
        })
        binding.editTextTextPersonName2.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                cambiar()}
        })

    }
    fun cambiar (){
        if(binding.editTextTextPersonName2.length()>0){
            contador2 = true
            if (contador1) {
                binding.button.isEnabled = true
            }
        }
        else { contador2 = false
            binding.button.isEnabled = false
        }
        if(binding.editTextTextPersonName.length()>0){
            contador1 = true
            if (contador2) {
                binding.button.isEnabled = true
            }
        }
        else { contador1 = false
            binding.button.isEnabled = false}

    }

}