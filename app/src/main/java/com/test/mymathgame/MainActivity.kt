package com.test.mymathgame

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.navigation.Navigation
import com.test.mymathgame.databinding.FragmentSettingsBinding
import kotlinx.android.synthetic.main.fragment_settings.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSupportNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.my_navigation_host).navigateUp()
    }

    override fun onBackPressed() {
            super.onBackPressed()
    }
}