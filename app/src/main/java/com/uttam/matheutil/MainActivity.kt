package com.uttam.matheutil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uttam.mathutillibrary.BasicMaths

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BasicMaths().showTotal(this.baseContext,100,200);
    }
}