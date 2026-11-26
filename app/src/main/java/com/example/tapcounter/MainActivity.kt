package com.example.tapcounter

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(48, 48, 48, 48)
        }

        val counterText = TextView(this).apply {
            text = "0"
            textSize = 64f
            gravity = Gravity.CENTER
        }

        val tapButton = Button(this).apply {
            text = "Tap Me"
            textSize = 20f
            setOnClickListener {
                count++
                counterText.text = count.toString()
            }
        }

        layout.addView(counterText)
        layout.addView(tapButton)
        setContentView(layout)
    }
}
