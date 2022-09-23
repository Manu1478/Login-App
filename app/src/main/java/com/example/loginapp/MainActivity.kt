package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRecyclerView.setOnClickListener {
            val intent =Intent(this,HobbiesActivity::class.java)
            startActivity(intent)
        }
        clicky.setOnClickListener {
            if(editTextTextEmailAddress.text.isNullOrBlank()||editTextTextPassword.text.isNullOrBlank())
            {
                Toast.makeText(this,"Please fill the required fields", Toast.LENGTH_SHORT).show()
            }
            else
            {
                val message: String= editTextTextEmailAddress.text.toString()
                Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
                val intent= Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }}
            button2.setOnClickListener {
                val message1: String=share_data.text.toString()
//                Toast.makeText(this,message1,Toast.LENGTH_SHORT).show()
//                val intent=Intent(this, SecondActivity:: class.java)
//                intent.putExtra("user_message",message1)
//                startActivity(intent)

                val intent = Intent()
                intent.action=Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT,message1)
                intent.type="text/plain"
                startActivity(Intent.createChooser(intent, "Which app: "))



//            Log.i("MainActivity", "Button was clicked")
//            Toast.makeText(this,"Button was clicked",Toast.LENGTH_SHORT).show()
        }

    }
}