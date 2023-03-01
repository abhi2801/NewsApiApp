package com.example.mynewsapplication.util

sealed class Resource<T>(val data:T?=null,val msg:String?=null){
    class Loading()
    class Success<T>(data: T):Resource<T>(data)
    class Failure<T>(msg: String,data: T?):Resource<T>(data, msg)
}
