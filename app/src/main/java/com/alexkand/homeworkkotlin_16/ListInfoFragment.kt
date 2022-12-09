package com.alexkand.homeworkkotlin_16

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.alexkand.homeworkkotlin_16.infoNewsRecyclerView.InfoNews
import com.alexkand.homeworkkotlin_16.infoNewsRecyclerView.InfoNewsAdapter
import kotlinx.android.synthetic.main.fragment_list_info.*
import kotlinx.android.synthetic.main.info_news_adapter_element.*


class ListInfoFragment : Fragment() {

    private var adapter: InfoNewsAdapter? = null
    private val listOfInfoNews = listOf<InfoNews>(InfoNews(infoNewsPicture =  "https://avatars.dzeninfra.ru/get-zen-logos/223306/pub_593005b98e557d4d1372cef7_59352fa07ddde8524b45c9a6/xxh",
    infoNewsDescriptions = "Москва. 9 декабря. INTERFAX.RU - Казахстанские банки получили разрешение от OFAC на осуществление операций по платежным картам системы \"МИР\", сообщила пресс-служба Агентства по регулированию и развитию финансового рынка республики в пятницу."),
        InfoNews(infoNewsPicture =  "https://mf.b37mrtl.ru/files/2022.12/l/63905c172030271eb315713a.jpg",
        infoNewsDescriptions = "Dec 7, 2022 12:55Western airlines need to return to Russian airspace – IATA"), InfoNews(infoNewsPicture =  "https://mf.b37mrtl.ru/files/2022.12/xxl/638cf81b85f5404ba27b199a.jpg",
            infoNewsDescriptions = "As Russia launches more nuclear ice-breakers, how global warming could lead to a new hotspot in the Arctic"), InfoNews(infoNewsPicture =  "https://mf.b37mrtl.ru/files/2022.12/xxl/638cf81b85f5404ba27b199a.jpg",
            infoNewsDescriptions = "As Russia launches more nuclear ice-breakers, how global warming could lead to a new hotspot in the Arctic"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setInfoNewsAdapter()
    }

    private fun setInfoNewsAdapter(){
        adapter = InfoNewsAdapter()
        adapter?.listOfInfoNews = listOfInfoNews
        rvListInfoNews.adapter = adapter
        rvListInfoNews.layoutManager = LinearLayoutManager(requireContext())
    }
}