package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // to do..
            }
        })

        // 버튼에 람다식을 사용할 수 있는 조건
        // 1. kotlin interface가 아닌 java interface여야 함.
        // 2. 그 인터페이스는 딱 하나의 메소드만 가져야 함.

        button.setOnClickListener{
            // to do..
        }
    }
}