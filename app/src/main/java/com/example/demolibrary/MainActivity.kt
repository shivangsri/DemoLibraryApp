package com.example.demolibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toast.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toaster.toast(this,"Demo application")
    }
}