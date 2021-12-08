package com.darelllego.newsapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.darelllego.newsapp.DetailActivity
import com.darelllego.newsapp.R
import com.darelllego.newsapp.data.News

class NewsAdapter(private val listNews: ArrayList<News>):
    RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view){
    val tvTitle: TextView = view.findViewById(R.id.tv_title)
    val tvCategory: TextView =  view.findViewById(R.id.tv_category)
    val tvdate: TextView = view.findViewById(R.id.tv_date)
    val tvTime: TextView = view.findViewById(R.id.tv_time)
    val imgNews: ImageView = view.findViewById(R.id.img_news)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_news, parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.apply {
            tvTitle.text = listNews[position].title
            tvCategory.text = listNews[position].category
            tvdate.text = listNews[position].date
            tvTime.text = listNews[position].time
            imgNews.setImageResource(listNews[position].photo)

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_OBJECT_NEWS, listNews[position])
                itemView.context.startActivity(intent)
            }


        }
    }

    override fun getItemCount() = listNews.size
}