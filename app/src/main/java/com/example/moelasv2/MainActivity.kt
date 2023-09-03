package com.example.moelasv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.moelasv2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        binding.letsGo.setOnClickListener {
            var Username = binding.username.text

            if (Username != null) {
                if(Username.isBlank()){
                    Log.d("AAA Invalid Username", "Please enter one")
                    //message defining the error state when the username box isn't filled out
                    Toast.makeText(this, "Please enter your name.", Toast.LENGTH_SHORT).show()
                } else{
                    Log.d("AAA  Captured Username :",Username.toString())

                    val intent = Intent(this,CategoriesActivity::class.java)

                    intent.putExtra("username", Username.toString())

                    startActivity(intent)
                    finish()
                }//navigate to the categories page
            }
        }

    }
}