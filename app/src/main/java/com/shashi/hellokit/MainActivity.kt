package com.shashi.hellokit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    private lateinit var logoKit:ImageView
    private lateinit var logoKims:ImageView
    private lateinit var logoKip:ImageView
    private lateinit var logoDeveloper:ImageView
    private lateinit var cardKgi:CardView
    private lateinit var cardKit:CardView
    private lateinit var cardKims:CardView
    private lateinit var cardKip:CardView
    private lateinit var cardDeveloper:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logoKit = findViewById(R.id.logoKit)
        logoKims = findViewById(R.id.logoKims)
        logoKip = findViewById(R.id.logoKip)
        logoDeveloper = findViewById(R.id.logoDeveloper)

        cardKgi=findViewById(R.id.cardKgi)
        cardKit=findViewById(R.id.cardKit)
        cardKims=findViewById(R.id.cardKims)
        cardKip = findViewById(R.id.cardKip)
        cardDeveloper = findViewById(R.id.cardDeveloper)

        //handle click on KGI
        cardKgi.setOnClickListener{
            Toast.makeText(this@MainActivity,"clickedOnKGI",Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity,MainActivity::class.java)
            startActivity(intent)
        }


        //handle click on KIT
        cardKit.setOnClickListener{
//            Toast.makeText(this@MainActivity,"clickedOnKIT",Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity,LoginActivity::class.java)
            startActivity(intent)
        }
        logoKit.setOnClickListener{
//            Toast.makeText(this@MainActivity,"clickedOnKIT",Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity,LoginActivity::class.java)
            startActivity(intent)
        }


        //handle click on KIMS
        cardKims.setOnClickListener{
//            Toast.makeText(this@MainActivity,"clickedOnKIMS",Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity,LoginActivity::class.java)
            startActivity(intent)
        }
        logoKims.setOnClickListener{
//            Toast.makeText(this@MainActivity,"clickedOnKIMS",Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity,LoginActivity::class.java)
            startActivity(intent)
        }


        //handle click on KIP
        logoKip.setOnClickListener{
//            Toast.makeText(this@MainActivity,"clickedOnKIP",Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity,LoginActivity::class.java)
            startActivity(intent)
        }
        cardKip.setOnClickListener{
//            Toast.makeText(this@MainActivity,"clickedOnKIP",Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity,LoginActivity::class.java)
            startActivity(intent)
        }


        //handle click on Developer
        logoDeveloper.setOnClickListener{
            Toast.makeText(this@MainActivity,"clickedOnSHASHI",Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity,LoginActivity::class.java)
            startActivity(intent)
        }
        cardDeveloper.setOnClickListener{
            Toast.makeText(this@MainActivity,"clickedOnSHASHI",Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity,LoginActivity::class.java)
            startActivity(intent)
        }

    }
}