package com.shashi.hellokit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.shashi.hellokit.kims.KimsActivity
import com.shashi.hellokit.kip.KipActivity
import com.shashi.hellokit.kit.KitActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var etUsername : EditText
    private lateinit var etPassword:EditText
    private lateinit var btnLogin:Button
    private lateinit var txtForgotPassword:TextView
    private lateinit var imgKGI:ImageView

    private val defaultKIMSUserId = "1123"
    private val defaultKIMSPassword = "s1123"
    private val defaultKITUserId = "428"
    private val defaultKITPassword = "s428"
    private val defaultKIPUserId = "00"
    private val defaultKIPPassword = "s00"
    private val defaultDeveloperUserId = "404"
    private val defaultDeveloperPassword = "s404"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etUsername=findViewById(R.id.etUsername)
        etPassword=findViewById(R.id.etPassword)
        btnLogin=findViewById(R.id.btnLogin)
        txtForgotPassword=findViewById(R.id.txtForgotPassword)
        imgKGI=findViewById(R.id.imgKGI)

        btnLogin.setOnClickListener{
            val userId = etUsername.editableText.toString()
            val password = etPassword.editableText.toString()

            if(userId.isEmpty()){
                etUsername.error="Bro User I'd to daal..."
            }
            if(password.isEmpty()){
                etPassword.error="Password bhi to daal yar..."
            }

            if (userId==defaultKIMSUserId){
                if (password==defaultKIMSPassword){
                    val intent = Intent(this@LoginActivity, KimsActivity::class.java)
                    intent.putExtra("userid",userId)
                    startActivity(intent)
                }else{
                    Toast.makeText(this@LoginActivity,"Wrong Password", Toast.LENGTH_SHORT).show()
                }
            }else if (userId==defaultKITUserId){
                if (password==defaultKITPassword){
                    val intent = Intent(this@LoginActivity, KitActivity::class.java)
                    intent.putExtra("userid",userId)
                    startActivity(intent)
                }else{
                    Toast.makeText(this@LoginActivity,"Wrong Password", Toast.LENGTH_SHORT).show()
                }
            }else if (userId==defaultKIPUserId){
                if (password==defaultKIPPassword){
                    val intent = Intent(this@LoginActivity, KipActivity::class.java)
                    intent.putExtra("userid",userId)
                    startActivity(intent)
                }else{
                    Toast.makeText(this@LoginActivity,"Wrong Password", Toast.LENGTH_SHORT).show()
                }
            }else if (userId==defaultDeveloperUserId){
                if (password==defaultDeveloperPassword){
                    val intent = Intent(this@LoginActivity,DeveloperActivity::class.java)
                    intent.putExtra("userid",userId)
                    startActivity(intent)
                }
            }else{
                Toast.makeText(this@LoginActivity,"Wrong User Id", Toast.LENGTH_SHORT).show()
            }
        }

        txtForgotPassword.setOnClickListener{
            Toast.makeText(this@LoginActivity,"forgot password ?\nContact to Developer", Toast.LENGTH_SHORT).show()

        }



        imgKGI.setOnClickListener {
            Toast.makeText(this@LoginActivity,"Back to Main Gate...!!",Toast.LENGTH_SHORT).show()
            val intent = Intent(this@LoginActivity,MainActivity::class.java)
            startActivity(intent)
        }

    }

}