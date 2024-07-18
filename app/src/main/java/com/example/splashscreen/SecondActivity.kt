package com.example.splashscreen

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val textView = findViewById<TextView>(R.id.textView)
        // Create a SpannableStringBuilder
        val spannable = SpannableStringBuilder()
        // Part 1: "Hello" in red
        val part1 = SpannableString("Vice")
        part1.setSpan(ForegroundColorSpan(Color.MAGENTA), 0, part1.length, 0)
        spannable.append(part1)
        // Part 2: " " (space) in default color
        spannable.append(" ")
        // Part 3: "World" in blue
        val part3 = SpannableString("City")
        part3.setSpan(ForegroundColorSpan(Color.CYAN), 0, part3.length, 0)
        spannable.append(part3)
        // Set the text to the TextView
        textView.text = spannable
    }
}