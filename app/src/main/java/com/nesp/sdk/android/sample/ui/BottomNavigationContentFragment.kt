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