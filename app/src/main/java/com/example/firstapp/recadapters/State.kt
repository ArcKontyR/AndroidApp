package com.example.firstapp.recadapters
import com.example.firstapp.R

data class State(val state_title:String, val state_text:String, val state_img:Int){
    class MyState{val list = arrayListOf(
        State("Заголовок статьи", "Краткое описание", R.drawable.state_img_1),
        State("Заголовок статьи", "Краткое описание", R.drawable.state_img_2),
        State("Заголовок статьи", "Краткое описание", R.drawable.state_img_3)
    )}
}
