package com.nesp.sdk.android.sample.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.nesp.sdk.android.sample.R
import com.nesp.sdk.android.sample.databinding.ActivitySmoothDialogSampleBinding
import com.nesp.sdk.android.smooth.app.ISmoothDialog
import com.nesp.sdk.android.smooth.app.SmoothAlertDialog

/**
 *
 *
 * Team: NESP Technology
 * @author: <a href="mailto:1756404649@qq.com">靳兆鲁 Email:1756404649@qq.com</a>
 * Time: Created 2020/10/13 19:28
 * Project: NespAndroidSdkSample
 **/
class SmoothDialogSampleActivity : SampleBaseActivity() {

    private lateinit var viewBinding: ActivitySmoothDialogSampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySmoothDialogSampleBinding.inflate(layoutInflater)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        viewBinding.btnSmoothAlertDialogOneAction.setOnClickListener { showSmoothAlertDialog(1) }
        viewBinding.btnSmoothAlertDialogTwoAction.setOnClickListener { showSmoothAlertDialog(2) }
        viewBinding.btnSmoothAlertDialogThreeAction.setOnClickListener { showSmoothAlertDialog(3) }
        setContentView(viewBinding.root)
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
                            Toast.makeText(
                                this@SmoothDialogSampleActivity,
                                action.text,
                                Toast.LENGTH_LONG
                            )
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