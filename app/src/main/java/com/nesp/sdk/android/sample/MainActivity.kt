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

package com.nesp.sdk.android.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nesp.sdk.android.sample.databinding.ActivityMainBinding
import com.nesp.sdk.android.sample.ui.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.btnSmoothActivitySample.setOnClickListener { SmoothActivitySample.start(this) }
        viewBinding.btnSmoothBottomNavigationActivitySample.setOnClickListener {
            SmoothBottomNavigationActivitySample.start(this)
        }
        viewBinding.btnSmoothDialogSample.setOnClickListener {
            SmoothDialogSampleActivity.start(this)
        }
        viewBinding.btnSmoothSwitch.setOnClickListener {
            SmoothSwitchSampleActivity.start(this)
        }
        viewBinding.btnSmoothSlider.setOnClickListener {
            SmoothSliderSampleActivity.start(this)
        }
        viewBinding.btnSmoothActionSheetDialog.setOnClickListener {
            SmoothActionSheetDialogSampleActivity.start(this)
        }
        viewBinding.btnSmoothActivityIndicator.setOnClickListener {
            SmoothActivityIndicatorSampleActivity.start(this)
        }
        viewBinding.btnSmoothRecyclerView.setOnClickListener {
            SmoothRecyclerViewSampleActivity.start(this)
        }
        viewBinding.btnSmoothNavigationSample.setOnClickListener {
            NavigationSampleActivity.start(this)
        }
    }
}