package com.example.scrollview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//a scroll view takes only one child in its component view
//always add another layout option :Constraint or Linear under the main scroll view layout

//use the "    <HorizontalScrollView" option in the .xml when you wanna create a horizontal scrolling option
//you dont need extra layout options for a vertical scroll view


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}