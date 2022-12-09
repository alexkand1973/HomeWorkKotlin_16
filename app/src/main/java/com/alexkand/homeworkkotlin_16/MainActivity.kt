package com.alexkand.homeworkkotlin_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//Сделайте приложение, которое будет содержать в себе один экран.
// Экран должен быть сделан в виде фрагмента.
// Пусть приложение будет выводить список новостей с помощью RecyclerView.
// Используйте паттерн SingleActivity. Элемент списка должен хранить в себе ImageView и TextView.

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, ListInfoFragment()).commit()
    }
}