package com.nesp.sdk.android.sample.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.nesp.sdk.android.sample.R
import com.nesp.sdk.android.smooth.app.ISmoothDialog
import com.nesp.sdk.android.smooth.app.SmoothAlertDialog
import kotlinx.android.synthetic.main.activity_smooth_dialog_sample.*

/**
 *
 *
 * Team: NESP Technology
 * @author: <a href="mailto:1756404649@qq.com">靳兆鲁 Email:1756404649@qq.com</a>
 * Time: Created 2020/10/13 19:28
 * Project: NespAndroidSdkSample
 **/
class SmoothDialogSampleActivity : SampleBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smooth_dialog_sample)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        btnSmoothAlertDialogOneAction.setOnClickListener { showSmoothAlertDialog(1) }
        btnSmoothAlertDialogTwoAction.setOnClickListener { showSmoothAlertDialog(2) }
        btnSmoothAlertDialogThreeAction.setOnClickListener { showSmoothAlertDialog(3) }
    }

    private fun showSmoothAlertDialog(actionCount: Int) {
        val actions = arrayListOf<ISmoothDialog.Action>()
        for (i in 0 until actionCount) {
            actions.add(
                ISmoothDialog.Action("Action${i + 1}",
                    object : ISmoothDialog.OnActionClickListener {
                        override fun onClick(
                            view: View, action: ISmoothDialog.Action, position: Int
                        ) {
                            Toast.makeText(this@SmoothDialogSampleActivity, action.text, Toast.LENGTH_LONG)
                                .show()
                        }
                    })
            )
        }
        SmoothAlertDialog.Builder(this)
            .setTitle("Title")
            .setMessage("Message")
            .addActions(actions)
            .create().show()

    }

    companion object {
        @JvmStatic
        fun start(context: Context) {
            val starter = Intent(context, SmoothDialogSampleActivity::class.java)
            context.startActivity(starter)
        }
    }
}