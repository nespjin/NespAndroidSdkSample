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
import android.view.View
import androidx.fragment.app.Fragment
import com.nesp.sdk.android.sample.R
import com.nesp.sdk.android.smooth.app.SmoothBottomNavigationFragment

/**
 *
 *
 * Team: NESP Technology
 * Author: <a href="mailto:1756404649@qq.com">Jinzhaolu Email:1756404649@qq.com</a>
* Time: Created 2021/4/26 22:32
 * Project: NespAndroidSdkSample
 **/
class SmoothBottomNavigationFragmentSample : SmoothBottomNavigationFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Do not call setContentView
        val badgeDrawable = getBottomNavigationView().getOrCreateBadge(R.id.navigation_tab2)
        badgeDrawable.number = 100

        val badgeDrawable2 = getBottomNavigationView().getOrCreateBadge(R.id.navigation_tab3)
        badgeDrawable2.isVisible = true
    }

    override fun getFragments(): List<Fragment> {
        return arrayListOf(
            BottomNavigationContentFragment(),
            BottomNavigationContentFragment(),
            BottomNavigationContentFragment()
        )
    }
}