package com.example.firstapp.retrofitConnections

data class login(val id:String, val email:String,val nickName:String, val avatar:String, val token:String)

data class feelings(val success:Boolean, val data:ArrayList<data_feelings>)
data class data_feelings(val id:Int, val title:String, val image:String, val position:Int)

data class quotes(val success:Boolean, val data:ArrayList<data_quotes>)
data class data_quotes(val id:Int, val title:String, val image:String, val description:String)