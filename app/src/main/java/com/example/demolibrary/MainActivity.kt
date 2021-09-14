package com.example.demolibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toast.Toaster
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sum.text= Toaster.toast(7,5).toString()

    }
}