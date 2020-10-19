package com.nesp.sdk.android.sample.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.nesp.sdk.android.sample.R
import com.nesp.sdk.android.smooth.app.ISmoothActionSheetDialog
import com.nesp.sdk.android.smooth.app.SmoothActionSheetDialog
import kotlinx.android.synthetic.main.activity_smooth_action_sheet_dialog_sample.*

/**
 *
 *
 * Team: NESP Technology
 * @author: <a href="mailto:1756404649@qq.com">靳兆鲁 Email:1756404649@qq.com</a>
 * Time: Created 2020/10/19 23:27
 * Project: NespAndroidSdkSample
 **/
class SmoothActionSheetDialogSampleActivity : SampleBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smooth_action_sheet_dialog_sample)
        smoothActionSheetDialog.setOnClickListener {
            showActionSheetDialog()
        }
    }

    private fun showActionSheetDialog() {
        SmoothActionSheetDialog.Builder(this)
            .setTitle("test")
            .setDescription("This is a test case")
            .addAction(
                ISmoothActionSheetDialog.Action("Add",
                    object : ISmoothActionSheetDialog.OnActionClickListener {
                        override fun onClick(
                            view: View, action: ISmoothActionSheetDialog.Action, position: Int
                        ) {
                            Toast.makeText(
                                this@SmoothActionSheetDialogSampleActivity,
                                action.text, Toast.LENGTH_SHORT
                            ).show()
                        }
                    })
            )
            .addAction(
                ISmoothActionSheetDialog.Action(
                    "Delete",
                    ISmoothActionSheetDialog.ActionType.DANGER,
                    object :ISmoothActionSheetDialog.OnActionClickListener{
                        override fun onClick(
                            view: View,
                            action: ISmoothActionSheetDialog.Action,
                            position: Int
                        ) {
                            Toast.makeText(
                                this@SmoothActionSheetDialogSampleActivity,
                                action.text, Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                )
            )
            .create().show()
    }

    companion object {
        @JvmStatic
        fun start(context: Context) {
            val starter = Intent(context, SmoothActionSheetDialogSampleActivity::class.java)
            context.startActivity(starter)
        }
    }
}