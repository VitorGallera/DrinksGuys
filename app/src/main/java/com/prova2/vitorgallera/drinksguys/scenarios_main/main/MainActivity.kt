package com.prova2.vitorgallera.drinksguys.scenarios_main.main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ProgressBar
import android.widget.Toast
import com.prova2.vitorgallera.drinksguys.R
import com.prova2.vitorgallera.drinksguys.entites.Drink
import com.prova2.vitorgallera.drinksguys.scenarios_main.main.MainActivity.AppConstants.DRINK_ID
import com.prova2.vitorgallera.drinksguys.scenarios_main.spec.SpecActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View {

    object AppConstants{
        const val DRINK_ID: String = "id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAlcool.setOnClickListener{
            val openSpec = Intent(this, SpecActivity::class.java)
            startActivity(openSpec)
        }

        val presenter : MainContract.Presenter = MainPresenter(this)
        presenter.onLoadList()
    }

    override fun showList(drinks: List<Drink>){
        val adapter = DrinkAdapter(this, drinks)
        adapter.setOnItemClickListener {position ->
            val openSpec = Intent(this, SpecActivity::class.java)
            openSpec.putExtra(DRINK_ID, drinks[position].idDrink)
            startActivity(openSpec)
        }

        rvDrinks.adapter = adapter
        rvDrinks.layoutManager = LinearLayoutManager(this)
    }


    override fun showMessage(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }
    override fun showLoading() {
        pgBar.visibility = ProgressBar.VISIBLE
    }

    override fun hideLoading() {
        pgBar.visibility = ProgressBar.INVISIBLE
    }




}
