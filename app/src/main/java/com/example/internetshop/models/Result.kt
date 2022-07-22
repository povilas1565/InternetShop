package com.example.internetshop.models

import com.example.internetshop.models.Product
import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("products")
    var products: List<Product> = listOf()
)

