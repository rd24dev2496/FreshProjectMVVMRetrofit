package com.example.freshprojectmvvmretrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel constructor(private val repository: MainRepository):ViewModel() {
    var amiiboList= MutableLiveData<JSONResponse>()
    val errorMessage = MutableLiveData<String>()
    fun getAllAmiibo(){
        val response = repository.getAllAmiibo()

        response.enqueue(object : Callback<JSONResponse?> {
                override fun onResponse(call: Call<JSONResponse?>, response: Response<JSONResponse?>) {
               amiiboList.postValue(response.body())

                }

            override fun onFailure(call: Call<JSONResponse?>, t: Throwable) {
            }

        })


    }

}





