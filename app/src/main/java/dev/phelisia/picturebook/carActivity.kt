package dev.phelisia.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class carActivity : AppCompatActivity() {
    lateinit var btnPrevious2:Button
    lateinit var btnNext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car)
        btnNext3=findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            val intent=Intent(this,homeActivity::class.java)
            startActivity(intent)
        }
        btnPrevious2=findViewById(R.id.btnPrevious2)
        btnPrevious2.setOnClickListener {
            val intent=Intent(this,houseActivity::class.java)
            startActivity(intent)
        }
    }
}