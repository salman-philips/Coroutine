package com.abrselmantutorials.coroutineapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


   private fun raceCondition() {
        var count = 0
        for (i in 1..50) {
            Thread {
                count += 1
                Log.d("Race Condition", "Thread: $i count: $count")
            }.start()
        }
    }


    override fun onResume() {
        super.onResume()
        raceCondition()
    }
}