package com.deasunara.kotlin_dasar5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val extra = intent

        val nama = extra.getStringExtra("nama")

        txtNama.text = nama.toString()

    }
}
