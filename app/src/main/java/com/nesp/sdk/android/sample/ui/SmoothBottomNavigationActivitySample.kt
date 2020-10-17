package com.nesp.sdk.android.sample.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.core.widget.NestedScrollView
import androidx.fragment.app.Fragment
import com.nesp.sdk.android.core.ktx.cast
import com.nesp.sdk.android.sample.R
import com.nesp.sdk.android.smooth.app.SmoothBottomNavigationActivity
import com.nesp.sdk.android.smooth.app.SmoothFragment

/**
 *
 * @@author: <a href="mailto:1756404649@qq.com">靳兆鲁 Email:1756404649@qq.com</a>
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

    companion object {
        fun start(context: Context) {
            val starter = Intent(context, SmoothBottomNavigationActivitySample::class.java)
            context.startActivity(starter)
        }
    }

}