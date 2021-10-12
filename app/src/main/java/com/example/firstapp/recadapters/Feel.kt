package com.example.firstapp.recadapters
import com.example.firstapp.R

data class Feel(val image:Int, val name_feel:String){
    class MyFeel{val list = arrayListOf(
        Feel(R.drawable.calm, "Спокойным"),
        Feel(R.drawable.relax, "Расслабленным"),
        Feel(R.drawable.focus, "Сосредоточенным"),
        Feel(R.drawable.anxious, "Взволнованным"),
        Feel(R.drawable.empty, "Никакой")
    )}
}
