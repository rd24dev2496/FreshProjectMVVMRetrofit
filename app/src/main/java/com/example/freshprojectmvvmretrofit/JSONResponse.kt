package com.example.freshprojectmvvmretrofit

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

 class JSONResponse {

     @SerializedName("amiibo")
     @Expose
     var amiibo: List<Amiibo>? = null

}













