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
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nesp.sdk.android.sample.databinding.ActivitySmoothRecyclerViewSampleBinding

/**
 *
 *
 * Team: NESP Technology
 * Author: <a href="mailto:1756404649@qq.com">Jinzhaolu Email:1756404649@qq.com</a>
* Time: Created 2020/10/18 19:19
 * Project: NespAndroidSdk
 **/
class SmoothRecyclerViewSampleActivity : SampleBaseActivity() {

    private lateinit var viewBinding: ActivitySmoothRecyclerViewSampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySmoothRecyclerViewSampleBinding.inflate(layoutInflater)
        viewBinding.recyclerView.adapter = SampleAdapter()
        viewBinding.recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        setContentView(viewBinding.root)
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