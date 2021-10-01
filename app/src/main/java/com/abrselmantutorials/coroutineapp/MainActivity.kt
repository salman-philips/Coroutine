package com.abrselmantutorials.coroutineapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        singleThreading()
        multipleThreading()
    }

    private fun singleThreading() {
        val thread = Thread {
            Log.d("Coroutine Single", "${Thread.currentThread()} has run.")
        }
        thread.start()
    }


    private fun multipleThreading() {
        val states = arrayOf("Starting", "Doing Task 1", "Doing Task 2", "Ending")
        repeat(3) {
            Thread {
                Log.d("Coroutine Multiple", "${Thread.currentThread()} has started")
                for (i in states) {
                    Log.d("Coroutine Multiple", "${Thread.currentThread()} - $i")
                    Thread.sleep(50)
                }
            }.start()
        }
    }



}