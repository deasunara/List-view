package com.deasunara.kotlin_dasar5

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var kumpulanNama = ArrayList<String>()
        kumpulanNama.add("Kopi")
        kumpulanNama.add("Teh")
        kumpulanNama.add("Gula")
        kumpulanNama.add("Es")
        kumpulanNama.add("Air Mineral")

        val arrayadapter = ArrayAdapter(applicationContext, android.R.layout.simple_list_item_1, kumpulanNama)
        listNama.adapter = arrayadapter

        listNama.onItemClickListener = AdapterView.OnItemClickListener{adapterView, view,i,l ->

            val intent = Intent(applicationContext, detail::class.java)
            intent.putExtra("nama",kumpulanNama[i])

            startActivity(intent)
        }
    }
}
