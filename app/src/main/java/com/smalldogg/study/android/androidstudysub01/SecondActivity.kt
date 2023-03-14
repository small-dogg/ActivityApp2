package com.smalldogg.study.android.androidstudysub01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val data1 = intent.getIntExtra("data1", 0)
        val data2 = intent.getStringExtra("data2")

        textView2.text= "data1 : ${data1}\n"
        textView2.append("data2 : ${data2}\n")

        button.setOnClickListener {
            val result_intent = Intent()
            result_intent.putExtra("value1", 200)
            result_intent.putExtra("value2", "문자열2")

            setResult(RESULT_OK, result_intent)


            finish()
        }
    }
}