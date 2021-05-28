/*
 * Copyright (C) 2021 The NESP Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nesp.sdk.android.sample.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.nesp.sdk.android.core.ktx.TAG
import com.nesp.sdk.android.sample.R
import com.nesp.sdk.android.sample.databinding.ActivitySmoothSliderSampleBinding
import com.nesp.sdk.android.smooth.widget.SmoothSlider

/**
 *
 *
 * Team: NESP Technology
 * Author: <a href="mailto:1756404649@qq.com">Jinzhaolu Email:1756404649@qq.com</a>
 * Time: Created 2020/10/17 15:21
 * Project: NespAndroidSdkSample
 **/
class SmoothSliderSampleActivity : SampleBaseActivity() {

    private lateinit var viewBinding: ActivitySmoothSliderSampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySmoothSliderSampleBinding.inflate(layoutInflater)

        viewBinding.smoothSlider.setOnSliderChangeListener(object : SmoothSlider.OnSliderChangeListener {
            override fun onProgressChanged(
                smoothSlider: SmoothSlider, progress: Int, fromUser: Boolean
            ) {
                Log.e(
                    TAG, "SmoothSliderSampleActivity.onProgressChanged:progress $progress " +
                            "fromUser: $fromUser"
                )
                viewBinding.tvProgress.text = """
                    progress: $progress
                    fromUser: $fromUser
                """.trimIndent()
            }

            override fun onStartTrackingTouch(smoothSlider: SmoothSlider) {
                Log.e(TAG, "SmoothSliderSampleActivity.onStartTrackingTouch: ")
            }

            override fun onStopTrackingTouch(smoothSlider: SmoothSlider) {
                Log.e(TAG, "SmoothSliderSampleActivity.onStopTrackingTouch: ")
            }

        })

        viewBinding.smoothSlider.setProgress(50)


        viewBinding.smoothSlider2.setOnSliderChangeListener(object : SmoothSlider.OnSliderChangeListener {
            override fun onProgressChanged(
                smoothSlider: SmoothSlider,
                progress: Int,
                fromUser: Boolean
            ) {
                viewBinding.tvProgress2.text = """
                    progress:$progress
                    step:10
                    fromUser:$fromUser
                """.trimIndent()

            }

            override fun onStartTrackingTouch(smoothSlider: SmoothSlider) {

            }

            override fun onStopTrackingTouch(smoothSlider: SmoothSlider) {

            }

        })
        viewBinding.smoothSlider2.setProgress(50)
        setContentView(viewBinding.root)
    }

    companion object {
        @JvmStatic
        fun start(context: Context) {
            val starter = Intent(context, SmoothSliderSampleActivity::class.java)
            context.startActivity(starter)
        }
    }
}