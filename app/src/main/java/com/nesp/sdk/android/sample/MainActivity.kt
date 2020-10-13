package com.nesp.sdk.android.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nesp.sdk.android.sample.ui.SmoothActivitySample
import com.nesp.sdk.android.sample.ui.SmoothBottomNavigationActivitySample
import com.nesp.sdk.android.sample.ui.SmoothDialogSample
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSmoothActivitySample.setOnClickListener { SmoothActivitySample.start(this) }
        btnSmoothBottomNavigationActivitySample.setOnClickListener {
            SmoothBottomNavigationActivitySample.start(this)
        }
        btnSmoothDialogSample.setOnClickListener {
            SmoothDialogSample.start(this)
        }
    }
}