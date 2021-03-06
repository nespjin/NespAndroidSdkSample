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
import androidx.fragment.app.Fragment
import com.nesp.sdk.android.sample.R
import com.nesp.sdk.android.smooth.app.SmoothBottomNavigationActivity

/**
 *
 * @@author: <a href="mailto:1756404649@qq.com">Jinzhaolu Email:1756404649@qq.com</a>
 * Time: Created 2020/10/13 11:24 AM
 * Project: NespAndroidSdkSample
 * Description:
 **/
class SmoothBottomNavigationActivitySample : SmoothBottomNavigationActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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

    companion object {
        fun start(context: Context) {
            val starter = Intent(context, SmoothBottomNavigationActivitySample::class.java)
            context.startActivity(starter)
        }
    }

}