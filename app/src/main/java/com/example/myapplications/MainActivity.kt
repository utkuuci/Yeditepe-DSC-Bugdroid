package com.example.myapplications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceValue = findViewById<TextView>(R.id.dice_value_holder)
        val diceImg = findViewById<ImageView>(R.id.dice_image_holder)
        val rollBtn = findViewById<Button>(R.id.roll_button)
        val resetBtn = findViewById<Button>(R.id.reset_button)

        diceValue.setText("Roll a dice to get value")
//        diceImg.setImageResource(R.drawable.dice_four)
        rollBtn.setOnClickListener {
            val random = Random.nextInt(1,7)
            diceValue.setText("Dice is " + random.toString())
            when(random){
                1 -> diceImg.setImageResource(R.drawable.dice_one)
                2 -> diceImg.setImageResource(R.drawable.dice_two)
                3 -> diceImg.setImageResource(R.drawable.dice_three)
                4 -> diceImg.setImageResource(R.drawable.dice_four)
                5 -> diceImg.setImageResource(R.drawable.dice_five)
                6 -> diceImg.setImageResource(R.drawable.dice_six)
                else -> {
                    diceImg.setImageResource(R.drawable.gdsc)
                    diceValue.setText("Error")
                }
            }
            diceImg.animate().apply {
                duration = 1000
                rotationXBy(360f)
            }
        }
        resetBtn.setOnClickListener {
            diceImg.setImageResource(R.drawable.gdsc)
            diceValue.setText("Roll a dice")
            diceImg.animate().apply {
                duration = 500
                rotationBy(180f)
            }
        }

    }


//    fun RollDiceButton(v : View)
//    {
//        val diceValue = findViewById(R.id.dice_value_holder) as TextView
//        val diceImage = findViewById(R.id.dice_image_holder) as ImageView
//
//        var rnd = Random.nextInt(1,7)
//        diceValue.text = rnd.toString()
//
//        when (v.id)
//        {
//            R.id.roll_button ->
//            {
//                if(rnd == 1)
//                {
//                    diceImage.setImageResource(R.drawable.dice_one)
//                }
//                else if(rnd == 2)
//                {
//                    diceImage.setImageResource(R.drawable.dice_two)
//                }
//                else if(rnd == 3)
//                {
//                    diceImage.setImageResource(R.drawable.dice_three)
//                }
//                else if(rnd == 4)
//                {
//                    diceImage.setImageResource(R.drawable.dice_four)
//                }
//                else if(rnd == 5)
//                {
//                    diceImage.setImageResource(R.drawable.dice_five)
//                }
//                else if(rnd == 6)
//                {
//                    diceImage.setImageResource(R.drawable.dice_six)
//                }
//            }
//            R.id.reset_button ->
//            {
//                diceValue.text = "Sıfırlandı"
//                diceImage.setImageResource(R.drawable.gdsc)
//            }
//        }
//
//
//    }


}