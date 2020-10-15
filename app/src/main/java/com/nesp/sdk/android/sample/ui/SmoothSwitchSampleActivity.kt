package com.nesp.sdk.android.sample.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.nesp.sdk.android.sample.R

/**
 *
 * Author: <a href="mailto:1756404649@qq.com">JinZhaolu Email:1756404649@qq.com</a>
 * Time: Created 2020/10/15 8:59 AM
 * Project: NespAndroidSdkSample
 * Description:
 **/
class SmoothSwitchSampleActivity : SampleBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smooth_switch_sample)
    }

    companion object {
        fun start(context: Context) {
            val starter = Intent(context, SmoothSwitchSampleActivity::class.java)
            context.startActivity(starter)
        }
    }
}