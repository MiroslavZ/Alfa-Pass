package com.example.alfapass

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivePassActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.active_pass)
    }

    fun OpenEditPass(view:View)
    {
        var intent=Intent(this,EditPassActivity::class.java)
        startActivity(intent)
    }
}