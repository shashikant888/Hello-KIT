package com.shashi.hellokit.kit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.shashi.hellokit.R

class KitActivity : AppCompatActivity() {
    private lateinit var kitAttendance : Button
    private lateinit var txtKitShowMyUserId: TextView
    private lateinit var txtKitShowMyName: TextView
    private lateinit var txtKitDashboardUser: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kit)

        kitAttendance = findViewById(R.id.kitAttendance)
        txtKitShowMyUserId = findViewById(R.id.txtKitShowMyUserId)
        txtKitShowMyName = findViewById(R.id.txtKitShowMyName)
        txtKitDashboardUser = findViewById(R.id.txtKitDashboardUser)

        val showUserId = intent.getStringExtra("userid")
        txtKitShowMyUserId.text=showUserId

        kitAttendance.setOnClickListener{
            Toast.makeText(this@KitActivity,"let's View the Attendance of this Department...", Toast.LENGTH_SHORT).show()

        }
    }
}