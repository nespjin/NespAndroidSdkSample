package com.nesp.sdk.android.sample.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.NestedScrollView
import androidx.fragment.app.Fragment
import com.nesp.sdk.android.core.ktx.cast
import com.nesp.sdk.android.sample.R
import com.nesp.sdk.android.smooth.app.SmoothBottomNavigationActivity
import com.nesp.sdk.android.smooth.app.SmoothFragment

/**
 *
 * Author: <a href="mailto:jinzhaolu@numob.com">Jack Email:jinzhaolu@numob.com</a>
 * Time: Created 2020/10/13 11:24 AM
 * Project: NespAndroidSdkSample
 * Description:
 **/
class SmoothBottomNavigationActivitySample : SmoothBottomNavigationActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Do not call setContentView
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