package com.example.verizonfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        button.setOnClickListener {
           var redFrag = RedFragment()
            supportFragmentManager.beginTransaction().replace(R.id.fragmentGreen,redFrag).commit()
        }

        buttonBlue.setOnClickListener {
            var blueFrag = BlueFragment()
            supportFragmentManager.beginTransaction().replace(R.id.fragmentGreen,blueFrag).commit()
        }
    }
}