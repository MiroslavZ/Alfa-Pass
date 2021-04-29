package com.example.alfapass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class EditPassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_pass)
    }

    fun ShowDialog(view:View)
    {
        var dialog=CustomDialogFragment()
        dialog.show(supportFragmentManager,"customDialog")
    }

    fun GoBack(view:View)
    {
        finish()
    }

    fun SaveChanges(view:View)
    {
        Toast.makeText(applicationContext,"Изменения сохранены",Toast.LENGTH_SHORT)
        finish()
    }
}