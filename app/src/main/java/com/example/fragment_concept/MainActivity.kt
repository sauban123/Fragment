package com.example.fragment_concept

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.fragment_concept.ui.login.LoginFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn_clock = findViewById<Button>(R.id.btnClock)
        val btn_profile = findViewById<Button>(R.id.btnExam)
        val btn_validate = findViewById<Button>(R.id.btnValidate)

        btn_clock.setOnClickListener {
            replaceFrameWithFragment(clocl_fragment())
        }
        btn_profile.setOnClickListener {
            replaceFrameWithFragment(fragment_profile())
        }
        btn_validate.setOnClickListener {4
            replaceFrameWithFragment(LoginFragment())
        }
    }

    private fun replaceFrameWithFragment(frag: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayout, frag)
        fragmentTransaction.commit()
    }
}