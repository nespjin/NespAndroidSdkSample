package com.nesp.sdk.android.sample.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.nesp.sdk.android.core.ktx.TAG
import com.nesp.sdk.android.sample.R
import com.nesp.sdk.android.smooth.widget.SmoothSlider
import kotlinx.android.synthetic.main.activity_smooth_slider_sample.*

/**
 *
 *
 * Team: NESP Technology
 * @author: <a href="mailto:1756404649@qq.com">靳兆鲁 Email:1756404649@qq.com</a>
 * Time: Created 2020/10/17 15:21
 * Project: NespAndroidSdkSample
 **/
class SmoothSliderSampleActivity : SampleBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smooth_slider_sample)
        smoothSlider.setOnSliderChangeListener(object : SmoothSlider.OnSliderChangeListener {
            override fun onProgressChanged(
                smoothSlider: SmoothSlider, progress: Int, fromUser: Boolean
            ) {
                Log.e(
                    TAG, "SmoothSliderSampleActivity.onProgressChanged:progress $progress " +
                            "fromUser: $fromUser"
                )
                tvProgress.text = """
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

        smoothSlider.setProgress(50)


        smoothSlider2.setOnSliderChangeListener(object : SmoothSlider.OnSliderChangeListener {
            override fun onProgressChanged(
                smoothSlider: SmoothSlider,
                progress: Int,
                fromUser: Boolean
            ) {
                tvProgress2.text = """
                    progress:$progress
                    fromUser:$fromUser
                """.trimIndent()

            }

            override fun onStartTrackingTouch(smoothSlider: SmoothSlider) {

            }

            override fun onStopTrackingTouch(smoothSlider: SmoothSlider) {

            }

        })
        smoothSlider2.setProgress(50)
    }

    companion object {
        @JvmStatic
        fun start(context: Context) {
            val starter = Intent(context, SmoothSliderSampleActivity::class.java)
            context.startActivity(starter)
        }
    }
}