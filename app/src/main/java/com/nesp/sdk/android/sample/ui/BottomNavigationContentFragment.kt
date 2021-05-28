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

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.NestedScrollView
import com.nesp.sdk.android.core.ktx.cast
import com.nesp.sdk.android.sample.R
import com.nesp.sdk.android.smooth.app.SmoothFragment

class BottomNavigationContentFragment : SmoothFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.activity_smooth_sample, container, false)
        val nestedScrollView = rootView.findViewById<NestedScrollView>(R.id.nestedScrollView)
        requireActivity().cast<SmoothBottomNavigationActivitySample>()
            .adaptScrollerViewFitActivity(nestedScrollView)
        return rootView
    }
}