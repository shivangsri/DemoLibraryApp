package com.example.toast

import android.content.Context
import android.widget.Toast

class Toaster {
    companion object{
    fun toast(context:Context,msg:String) {

        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
    }
}}