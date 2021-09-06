package com.example.freshprojectmvvmretrofit

class Amiibo {
    var amiiboSeries: String? = null
    var character: String? = null
    var gameSeries: String? = null
    var head: String? = null
    var imageUrl: String? = null
    var name: String? = null
    //  var release: Release? = null
    var tail: String? = null
    var type: String? = null
}

class Root {
    var amiibo: List<Amiibo>? = null
}
//data class Amiibo(val amiiboSeries: String, val character: String, val gameSeries: String, val head: String,val name : String,val imageUrl:String)