package com.darelllego.newsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.darelllego.newsapp.R
import com.darelllego.newsapp.data.DataNews
import com.darelllego.newsapp.adapter.NewsAdapter
import com.darelllego.newsapp.initNewsHeadline


class TopFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_top, container, false)
        val rvTopNews = view.findViewById<RecyclerView>(R.id.rv_top_news)
        rvTopNews.layoutManager = LinearLayoutManager(view.context)
        rvTopNews.adapter = NewsAdapter(DataNews.dataTop)
        val newsHeadline = view.findViewById<View>(R.id.news_headline)
        initNewsHeadline(view.context, newsHeadline, 2)
        return view
    }


}