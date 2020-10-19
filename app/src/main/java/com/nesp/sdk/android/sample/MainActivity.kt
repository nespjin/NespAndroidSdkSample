package com.nesp.sdk.android.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nesp.sdk.android.sample.ui.*
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
            SmoothDialogSampleActivity.start(this)
        }
        btnSmoothSwitch.setOnClickListener {
            SmoothSwitchSampleActivity.start(this)
        }
        btnSmoothSlider.setOnClickListener {
            SmoothSliderSampleActivity.start(this)
        }
        btnSmoothActionSheetDialog.setOnClickListener {
            SmoothActionSheetDialogSampleActivity.start(this)
        }
    }
}