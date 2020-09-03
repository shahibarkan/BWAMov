package com.bagicode.bwamov.checkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bagicode.bwamov.R
import com.bagicode.bwamov.home.HomeActivity
import kotlinx.android.synthetic.main.activity_checkout.*

class CheckoutSuccessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout_success)

         btn_home.setOnClickListener {
             finishAffinity()

             var intent = Intent(this, HomeActivity::class.java)
             startActivity(intent)
         }
    }
}