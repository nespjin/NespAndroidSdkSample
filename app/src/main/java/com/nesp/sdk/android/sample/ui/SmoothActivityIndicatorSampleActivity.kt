package com.nesp.sdk.android.sample.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.nesp.sdk.android.sample.R

/**
 *
 *
 * Team: NESP Technology
 * @author: <a href="mailto:1756404649@qq.com">靳兆鲁 Email:1756404649@qq.com</a>
 * Time: Created 2020/10/18 19:19
 * Project: NespAndroidSdk
 **/
class SmoothActivityIndicatorSampleActivity : SampleBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smooth_activity_indicator_sample)
    }


    companion object {
        fun start(context: Context) {
            val starter = Intent(context, SmoothActivityIndicatorSampleActivity::class.java)
            context.startActivity(starter)
        }
    }
}