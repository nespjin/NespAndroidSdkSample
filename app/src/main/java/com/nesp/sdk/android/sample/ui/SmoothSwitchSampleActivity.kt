package com.nesp.sdk.android.sample.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.nesp.sdk.android.sample.databinding.ActivitySmoothSwitchSampleBinding
import com.nesp.sdk.android.smooth.widget.SmoothSwitch

/**
 *
 * Author: <a href="mailto:1756404649@qq.com">JinZhaolu Email:1756404649@qq.com</a>
 * Time: Created 2020/10/15 8:59 AM
 * Project: NespAndroidSdkSample
 * Description:
 **/
class SmoothSwitchSampleActivity : SampleBaseActivity() {

    private lateinit var viewBinding: ActivitySmoothSwitchSampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySmoothSwitchSampleBinding.inflate(layoutInflater)
        viewBinding.smoothSwitch.setOnCheckChangedListener(object : SmoothSwitch.OnCheckChangedListener {
            override fun onChanged(smoothSwitch: SmoothSwitch, isChecked: Boolean) {
                Toast.makeText(
                    this@SmoothSwitchSampleActivity, isChecked.toString(),
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
        setContentView(viewBinding.root)
    }

    companion object {
        fun start(context: Context) {
            val starter = Intent(context, SmoothSwitchSampleActivity::class.java)
            context.startActivity(starter)
        }
    }
}