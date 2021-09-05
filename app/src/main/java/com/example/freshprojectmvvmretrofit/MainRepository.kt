package com.example.freshprojectmvvmretrofit

class MainRepository constructor(private  val retrofitService: RetrofitService) {
fun getAllAmiibo()=retrofitService.getAllAmiibo()
}
