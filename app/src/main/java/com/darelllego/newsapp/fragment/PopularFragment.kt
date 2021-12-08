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


class PopularFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view = inflater.inflate(R.layout.fragment_popular, container, false)
        val rvPopularNews: RecyclerView = view.findViewById(R.id.rv_popular_news)
        rvPopularNews.layoutManager = LinearLayoutManager(view.context)
        rvPopularNews.adapter = NewsAdapter(DataNews.dataPopular)
        val newsHeadline = view.findViewById<View>(R.id.news_headline)
        initNewsHeadline(view.context, newsHeadline, 1)

        return view
    }

}