package dev.phelisia.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class homeActivity : AppCompatActivity() {
    lateinit var btnPrevious3:Button
    lateinit var btnBack:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btnBack=findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent=Intent(this,womanActivity::class.java)
            startActivity(intent)
        }
        btnPrevious3=findViewById(R.id.btnPrevious3)
        btnPrevious3.setOnClickListener {
            val intent=Intent(this,carActivity::class.java)
            startActivity(intent)
        }
    }
}