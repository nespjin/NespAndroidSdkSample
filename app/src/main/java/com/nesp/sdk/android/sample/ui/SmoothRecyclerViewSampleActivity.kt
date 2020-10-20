package com.nesp.sdk.android.sample.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nesp.sdk.android.sample.R
import kotlinx.android.synthetic.main.activity_smooth_recycler_view_sample.*

/**
 *
 *
 * Team: NESP Technology
 * @author: <a href="mailto:1756404649@qq.com">靳兆鲁 Email:1756404649@qq.com</a>
 * Time: Created 2020/10/18 19:19
 * Project: NespAndroidSdk
 **/
class SmoothRecyclerViewSampleActivity : SampleBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smooth_recycler_view_sample)
        recyclerView.adapter = SampleAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }

    private class SampleAdapter : RecyclerView.Adapter<SampleViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
            return SampleViewHolder(parent)
        }

        override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {
            holder.tvTextView.text = (position + 1).toString()
        }

        override fun getItemCount(): Int {
            return 100
        }

    }

    private class SampleViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(
            android.R.layout.simple_list_item_1,
            parent, false
        )
    ) {
        val tvTextView: TextView = itemView.findViewById(android.R.id.text1)
    }

    companion object {
        fun start(context: Context) {
            val starter = Intent(context, SmoothRecyclerViewSampleActivity::class.java)
            context.startActivity(starter)
        }
    }
}