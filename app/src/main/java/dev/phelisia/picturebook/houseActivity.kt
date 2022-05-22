package dev.phelisia.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class houseActivity : AppCompatActivity() {
    lateinit var btnPrevious1:Button
    lateinit var btnNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_house)
        btnNext2=findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            val intent=Intent(this,carActivity::class.java)
            startActivity(intent)
        }
        btnPrevious1=findViewById(R.id.btnPrevious1)
        btnPrevious1.setOnClickListener {
            val intent=Intent(this,graduateActivity::class.java)
            startActivity(intent)
        }
    }
}