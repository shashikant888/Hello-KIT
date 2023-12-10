package com.shashi.hellokit.kip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.shashi.hellokit.R

class KipActivity : AppCompatActivity() {
    private lateinit var kipAttendance : Button
    private lateinit var txtKipShowMyUserId: TextView
    private lateinit var txtKipShowMyName: TextView
    private lateinit var txtKipDashboardUser: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kip)

        kipAttendance = findViewById(R.id.kipAttendance)
        txtKipShowMyUserId = findViewById(R.id.txtKipShowMyUserId)
        txtKipShowMyName = findViewById(R.id.txtKipShowMyName)
        txtKipDashboardUser = findViewById(R.id.txtKipDashboardUser)

        val showUserId = intent.getStringExtra("userid")
        txtKipShowMyUserId.text=showUserId

        kipAttendance.setOnClickListener{
            Toast.makeText(this@KipActivity,"let's View the Attendance of this Department...", Toast.LENGTH_SHORT).show()

        }
    }
}