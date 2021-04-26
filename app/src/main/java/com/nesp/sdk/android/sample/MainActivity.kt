package com.nesp.sdk.android.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nesp.sdk.android.sample.databinding.ActivityMainBinding
import com.nesp.sdk.android.sample.ui.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.btnSmoothActivitySample.setOnClickListener { SmoothActivitySample.start(this) }
        viewBinding.btnSmoothBottomNavigationActivitySample.setOnClickListener {
            SmoothBottomNavigationActivitySample.start(this)
        }
        viewBinding.btnSmoothDialogSample.setOnClickListener {
            SmoothDialogSampleActivity.start(this)
        }
        viewBinding.btnSmoothSwitch.setOnClickListener {
            SmoothSwitchSampleActivity.start(this)
        }
        viewBinding.btnSmoothSlider.setOnClickListener {
            SmoothSliderSampleActivity.start(this)
        }
        viewBinding.btnSmoothActionSheetDialog.setOnClickListener {
            SmoothActionSheetDialogSampleActivity.start(this)
        }
        viewBinding.btnSmoothActivityIndicator.setOnClickListener {
            SmoothActivityIndicatorSampleActivity.start(this)
        }
        viewBinding.btnSmoothRecyclerView.setOnClickListener {
            SmoothRecyclerViewSampleActivity.start(this)
        }
    }
}