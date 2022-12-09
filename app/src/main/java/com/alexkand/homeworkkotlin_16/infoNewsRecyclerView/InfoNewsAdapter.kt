package com.alexkand.homeworkkotlin_16.infoNewsRecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.alexkand.homeworkkotlin_16.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.info_news_adapter_element.view.*

class InfoNewsAdapter : RecyclerView.Adapter<InfoNewsAdapter.InfoNewsViewHolder> (){

    var listOfInfoNews = listOf<InfoNews>()

    class InfoNewsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InfoNewsViewHolder {
        return InfoNewsViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.info_news_adapter_element, parent, false)
        )
    }

    override fun onBindViewHolder(holder: InfoNewsViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listOfInfoNews[position].infoNewsPicture)
            .into(holder.itemView.ivInfoNewsPicture)

        holder.itemView.tvInfoNewsDescriptions.text = listOfInfoNews[position].infoNewsDescriptions
    }

    override fun getItemCount(): Int {
        return listOfInfoNews.size
    }
}