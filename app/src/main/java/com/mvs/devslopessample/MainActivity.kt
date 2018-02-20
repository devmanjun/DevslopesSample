package com.mvs.devslopessample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val LOGTAG = "MainActivity"
    val foodList= arrayListOf("One","Two","Three");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_decide_food.setOnClickListener()
        {
            val randomNumber=Random()
            val randomIndex=randomNumber.nextInt(foodList.count())
            tv_food_name.text=foodList[randomIndex]
        }

        btn_add_food.setOnClickListener()
        {
            val newFood=et_name_of_food.text.toString()
            foodList.add(newFood)
            et_name_of_food.text.clear()
        }
    }
}
