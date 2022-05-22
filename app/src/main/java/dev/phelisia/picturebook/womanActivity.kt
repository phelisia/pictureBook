package dev.phelisia.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class womanActivity : AppCompatActivity() {
    lateinit var  btnNext:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_woman)
        btnNext=findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            val intent=Intent(this,graduateActivity::class.java)
            startActivity(intent)
        }
    }
}