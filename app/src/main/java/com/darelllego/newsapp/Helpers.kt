package com.darelllego.newsapp

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.darelllego.newsapp.data.DataNews

fun initNewsHeadline(context: Context,view: View, number: Int){

    val imgNewsHeadline : ImageView = view.findViewById(R.id.img_headline)
    val tvTitleHeadline : TextView = view.findViewById(R.id.tv_title_headline)
    val tvDescHeadline : TextView = view.findViewById(R.id.tv_desc_headline)
    val tvDateHeadline : TextView = view.findViewById(R.id.tv_date_headline)
    val tvAuthorHeadline: TextView = view.findViewById(R.id.tv_person_headline)

    imgNewsHeadline.setImageResource(DataNews.photoHeadline[number])
    tvTitleHeadline.text = DataNews.titleHeadline[number]
    tvDescHeadline.text = DataNews.contentHeadline[number]
    tvDateHeadline.text = DataNews.dateHeadline[number]
    tvAuthorHeadline.text = DataNews.authorHeadline[number]

    view.setOnClickListener{
        val intent = Intent(context, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_DATA_TITLE, DataNews.titleHeadline[number])
        intent.putExtra(DetailActivity.EXTRA_DATA_DATE, DataNews.dateHeadline[number])
        intent.putExtra(DetailActivity.EXTRA_DATA_AUTHOR, DataNews.authorHeadline[number])
        intent.putExtra(DetailActivity.EXTRA_DATA_CONTENT, DataNews.contentHeadline[number])
        intent.putExtra(DetailActivity.EXTRA_DATA_IMAGE, DataNews.photoHeadline[number])

        context.startActivity(intent)


    }
}