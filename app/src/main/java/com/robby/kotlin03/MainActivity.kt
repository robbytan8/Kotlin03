package com.robby.kotlin03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.robby.kotlin03.databinding.ActivityMainBinding

/**
 * @author Robby Tan
 */
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()
            if (email == "robby.tan@it.maranatha.edu" && password == "720307") {
                Toast.makeText(
                    this,
                    resources.getString(R.string.message_login_success),
                    Toast.LENGTH_LONG
                ).show()
            } else {
                Snackbar.make(
                    this,
                    binding.constraintRoot,
                    resources.getString(R.string.message_error_login),
                    Snackbar.LENGTH_LONG
                ).show()
            }
        }
    }
}