package com.suhun.guessnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.suhun.guessnumber.databinding.ActivityMainBinding

lateinit var binging:ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val secretNumber = SecretNumber()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binging = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binging.root)
        Log.d("MainActivity", "random_number ${secretNumber.randomNumber}")

    }
    fun runGuess(view:View){
        var message:String = secretNumber.verifyUserInput(resources,binging.userInput.text.toString().toInt())
        binging.guessCount.text = "${secretNumber.count}" + getString(R.string.times)
        AlertDialog.Builder(this).setTitle(getString(R.string.title_gess_number))
            .setMessage(message).setPositiveButton(getString(R.string.ok), null)
            .show()
    }
}