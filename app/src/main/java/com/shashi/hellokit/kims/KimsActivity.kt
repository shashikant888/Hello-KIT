package com.shashi.hellokit.kims

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.shashi.hellokit.R

class KimsActivity : AppCompatActivity() {

    private lateinit var kimsAttendance : Button
    private lateinit var txtKimsShowMyUserId:TextView
    private lateinit var txtKimsShowMyName:TextView
    private lateinit var txtKimsDashboardUser:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kims)

        title="Hello KIMS"

        kimsAttendance = findViewById(R.id.kimsAttendance)
        txtKimsShowMyUserId = findViewById(R.id.txtKimsShowMyUserId)
        txtKimsShowMyName = findViewById(R.id.txtKimsShowMyName)
        txtKimsDashboardUser = findViewById(R.id.txtKimsDashboardUser)

        val showUserId = intent.getStringExtra("userid")
        txtKimsShowMyUserId.text=showUserId

        kimsAttendance.setOnClickListener{
            Toast.makeText(this@KimsActivity,"Attendance of KIMS Department...", Toast.LENGTH_SHORT).show()

        }


    }
}