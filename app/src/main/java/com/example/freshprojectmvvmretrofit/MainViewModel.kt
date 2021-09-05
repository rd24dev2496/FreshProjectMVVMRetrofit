package com.example.freshprojectmvvmretrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel constructor(private  val repository: MainRepository):ViewModel() {
val amiiboList= MutableLiveData<List<Amiibo>>()
    val errorMessage = MutableLiveData<String>()
fun getAllAmiibo(){
    val response = repository.getAllAmiibo()
    response.enqueue(object : Callback<List<Amiibo>> {
        override fun onResponse(call: Call<List<Amiibo>>, response: Response<List<Amiibo>>) {
            amiiboList.postValue(response.body())
        }
        override fun onFailure(call: Call<List<Amiibo>>, t: Throwable) {
            errorMessage.postValue(t.message)
        }
    })
}

}
