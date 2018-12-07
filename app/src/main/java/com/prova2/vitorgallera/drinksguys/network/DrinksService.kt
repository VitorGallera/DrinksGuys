package com.prova2.vitorgallera.drinksguys.network


import com.prova2.vitorgallera.drinksguys.entites.DrinksList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface DrinksService {


    @GET("filter.php?")
    fun getDrinks(@Query("a") a: String = "Alcoholic"): Call<DrinksList>

    @GET("random.php")
    fun getRandon(): Call<DrinksList>

    @GET("lookup.php?")
    fun getLookup(@Query("i") i: Int): Call<DrinksList>


}