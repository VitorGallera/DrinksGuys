package com.prova2.vitorgallera.drinksguys.scenarios_main.main

import com.prova2.vitorgallera.drinksguys.entites.DrinksList
import com.prova2.vitorgallera.drinksguys.network.RetrofitInicializer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainPresenter(val view : MainContract.View) : MainContract.Presenter {

    override fun onLoadList(){

        view.showLoading()

        val drinksService = RetrofitInicializer().createDrinksService()

        val call = drinksService.getDrinks()

        call.enqueue(object : Callback<DrinksList> {
            override fun onFailure(call: Call<DrinksList>?, t: Throwable?) {
                view.hideLoading()
                view.showMessage("Falha na conexão")
            }

            override fun onResponse(call: Call<DrinksList>?, response: Response<DrinksList>?) {
                if (response != null) {
                    if (response.body() != null){
                        view.hideLoading()
                        view.showList(response.body()!!.drinks)
                    }else{
                        view.hideLoading()
                        view.showMessage("Sem drinks")
                    }
                }
            }
        })
    }
}