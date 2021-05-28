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
import android.view.View
import android.widget.Toast
import com.nesp.sdk.android.sample.databinding.ActivitySmoothActionSheetDialogSampleBinding
import com.nesp.sdk.android.smooth.app.ISmoothActionSheetDialog
import com.nesp.sdk.android.smooth.app.SmoothActionSheetDialog

/**
 *
 *
 * Team: NESP Technology
 * Author: <a href="mailto:1756404649@qq.com">Jinzhaolu Email:1756404649@qq.com</a>
* Time: Created 2020/10/19 23:27
 * Project: NespAndroidSdkSample
 **/
class SmoothActionSheetDialogSampleActivity : SampleBaseActivity() {

    private lateinit var viewBinding: ActivitySmoothActionSheetDialogSampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySmoothActionSheetDialogSampleBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.smoothActionSheetDialog.setOnClickListener {
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
                    object : ISmoothActionSheetDialog.OnActionClickListener {
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