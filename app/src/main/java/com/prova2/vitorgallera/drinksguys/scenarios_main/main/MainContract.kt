package com.prova2.vitorgallera.drinksguys.scenarios_main.main

import com.prova2.vitorgallera.drinksguys.entites.Drink

interface MainContract {

    interface View{
        abstract fun showMessage(msg: String)
        abstract fun showList(drinks: List<Drink>)
        fun showLoading()
        fun hideLoading()
    }

    interface Presenter{
        fun onLoadList()
    }
}