package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.kotlinpractice.R.drawable.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollbtn)

        rollButton.setOnClickListener { rollDice() }

        rollDice()
    }

    private fun rollDice() {

        val diceRoll = (1..6).random()
        val dicenum : TextView = findViewById(R.id.dicenum)
        val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
        val imageD : ImageView = findViewById(R.id.diceImage)
        dicenum.text = diceRoll.toString()

        when (diceRoll) {
            1 -> imageD.setImageResource(dice_1)
            2 -> imageD.setImageResource(dice_2)
            3 -> imageD.setImageResource(dice_3)
            4 -> imageD.setImageResource(dice_4)
            5 -> imageD.setImageResource(dice_5)
            6 -> imageD.setImageResource(dice_6)
        }
        imageD.contentDescription = diceRoll.toString()

        toast.show()
    }
}
