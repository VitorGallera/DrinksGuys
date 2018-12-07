package com.prova2.vitorgallera.drinksguys.scenarios_main.spec

import com.prova2.vitorgallera.drinksguys.entites.Drink

interface SpecContract {

    interface View{
        fun showMessage(msg: String)
        fun showDrinkDetail(drinks: List<Drink>)
    }

    interface Presenter {
        fun onLoadDrink(id: Int)
        fun onLoadRandomDrink()
    }
}