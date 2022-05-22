package dev.phelisia.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class graduateActivity : AppCompatActivity() {
    lateinit var btnNext1:Button
    lateinit var btnPrevious:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graduate)
        btnPrevious=findViewById(R.id.btnPrevious)
        btnPrevious.setOnClickListener {
            val intent=Intent(this,womanActivity::class.java)
            startActivity(intent)
        }
        btnNext1=findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener {
            val intent=Intent(this,houseActivity::class.java)
            startActivity(intent)
        }
    }
}