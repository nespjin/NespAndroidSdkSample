package com.nesp.sdk.android.sample.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import com.nesp.sdk.android.sample.R
import com.nesp.sdk.android.sample.databinding.ActivitySmoothSampleBinding
import com.nesp.sdk.android.smooth.app.SmoothActivity

/**
 *
 * @@author: <a href="mailto:1756404649@qq.com">靳兆鲁 Email:1756404649@qq.com</a>
 * Time: Created 2020/10/13 10:09 AM
 * Project: NespAndroidSdkSample
 * Description:
 **/
class SmoothActivitySample : SmoothActivity() {

    private lateinit var viewBinding: ActivitySmoothSampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySmoothSampleBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        setTitle("Title")
        setSubtitle("Subtitle")
        setLeftAction("Action") {
            showShortToast("This is Left Action")
        }
        setRightAction("Action") {
            showShortToast("Hide Subtitle")
            hideSubtitle()
        }
        adaptScrollerViewFitActivity(viewBinding.nestedScrollView)
        createRightMenu(R.menu.smooth_right_menu, menuInflater)
    }

    /**
     * Call when right menu item click
     */
    override fun onMenuItemClick(item: MenuItem?): Boolean {
        showShortToast(item?.title.toString())
        return super.onMenuItemClick(item)
    }

    companion object {
        fun start(context: Context) {
            val starter = Intent(context, SmoothActivitySample::class.java)
            context.startActivity(starter)
        }
    }
}