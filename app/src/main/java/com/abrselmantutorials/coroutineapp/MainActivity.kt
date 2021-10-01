package com.abrselmantutorials.coroutineapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    private fun firstCoroutine() {
        repeat(3) {
            GlobalScope.launch {
                Log.d("Coroutine","Hi from ${Thread.currentThread()}")
            }
        }
    }


    override fun onResume() {
        super.onResume()
        firstCoroutine()
    }
}