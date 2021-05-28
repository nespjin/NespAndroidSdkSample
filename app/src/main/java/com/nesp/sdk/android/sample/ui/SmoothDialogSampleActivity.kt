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
import androidx.databinding.DataBindingUtil
import com.nesp.sdk.android.sample.R
import com.nesp.sdk.android.sample.databinding.ActivitySmoothDialogSampleBinding
import com.nesp.sdk.android.smooth.app.ISmoothDialog
import com.nesp.sdk.android.smooth.app.SmoothAlertDialog

/**
 *
 *
 * Team: NESP Technology
 * Author: <a href="mailto:1756404649@qq.com">Jinzhaolu Email:1756404649@qq.com</a>
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