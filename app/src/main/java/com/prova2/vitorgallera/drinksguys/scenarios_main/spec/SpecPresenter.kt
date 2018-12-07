package com.prova2.vitorgallera.drinksguys.scenarios_main.spec

import android.util.Log
import com.prova2.vitorgallera.drinksguys.entites.DrinksList
import com.prova2.vitorgallera.drinksguys.network.RetrofitInicializer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SpecPresenter(val view : SpecContract.View) : SpecContract.Presenter {
    val drinkService = RetrofitInicializer().createDrinksService()

    override fun onLoadDrink(id : Int) {


        val call = drinkService.getLookup(id)

        call.enqueue(object : Callback<DrinksList> {
            override fun onFailure(call: Call<DrinksList>, t: Throwable) {
                view.showMessage("Falha na conexão. Verifique o acesso a internet")
            }

            override fun onResponse(call: Call<DrinksList>, response: Response<DrinksList>) {
                if(response.body() != null){

                    Log.d("RETORNO", response.body()!!.drinks.toString())
                    view.showDrinkDetail(response.body()!!.drinks)
                }else {

                    view.showMessage("Algo não deu certo")
                }
            }
        })
    }

    override fun onLoadRandomDrink() {
        val call = drinkService.getRandon()

        call.enqueue(object : Callback<DrinksList> {
            override fun onFailure(call: Call<DrinksList>, t: Throwable) {
                view.showMessage("Falha na conexão. Verifique o acesso a internet")
            }

            override fun onResponse(call: Call<DrinksList>, response: Response<DrinksList>) {
                if(response.body() != null){
                    view.showDrinkDetail(response.body()!!.drinks)
                }else {
                    view.showMessage("Ops!!! aconteceu um erro")
                }
            }
        })

    }
}