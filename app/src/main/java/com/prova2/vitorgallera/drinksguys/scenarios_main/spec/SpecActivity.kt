package com.prova2.vitorgallera.drinksguys.scenarios_main.spec

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.widget.CircularProgressDrawable
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.Toast
import com.prova2.vitorgallera.drinksguys.R
import com.prova2.vitorgallera.drinksguys.entites.Drink
import com.prova2.vitorgallera.drinksguys.scenarios_main.main.MainActivity.AppConstants.DRINK_ID
import com.prova2.vitorgallera.drinksguys.utils.GlideApp
import kotlinx.android.synthetic.main.novo_drink_spec.*

class SpecActivity : AppCompatActivity(), SpecContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.novo_drink_spec)

        val drinkID = intent.getStringExtra(DRINK_ID)
        val presenter : SpecContract.Presenter =
                SpecPresenter(this)
        if (drinkID != null){
            presenter.onLoadDrink(drinkID.toInt())
        } else {
            presenter.onLoadRandomDrink()
        }

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return if (item?.itemId == android.R.id.home) {
            finish()
            true
        } else {
            super.onOptionsItemSelected(item)
        }
    }

    override fun showMessage(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }


    @SuppressLint("SetTextI18n")
    override fun showDrinkDetail(drinks: List<Drink>) {
        val circularProgressDrawable = CircularProgressDrawable(this)
        circularProgressDrawable.strokeWidth = 5f
        circularProgressDrawable.centerRadius = 30f
        circularProgressDrawable.start()

        GlideApp.with(this)
                .load(drinks[0].strDrinkThumb)
                .placeholder(circularProgressDrawable)
                .centerCrop()
                .into(imgDrinkSpec)

        tvTitulo.text = "Name: ${drinks[0].strDrink}"
        tvCategory.text = "Category: ${drinks[0].strCategory}"
        tvCopo.text = "Glass: ${drinks[0].strGlass}"
        tvIntrucoes.text = "Instructions:  \n ${drinks[0].strInstructions}"
        tvIngredientes.text = geraIng(drinks[0])
    }

    private fun geraIng(drink: Drink): String{
        var ingredientes = "Ingredients: \n"
        if (drink.strIngredient1 != "")
            ingredientes = "$ingredientes ${drink.strIngredient1} - ${drink.strMeasure1} \n"
        else
            return ingredientes

        if (drink.strIngredient2 != "")
            ingredientes = "$ingredientes  ${drink.strIngredient2} - ${drink.strMeasure2} \n"
        else
            return ingredientes

        if (drink.strIngredient3 != "")
            ingredientes = "$ingredientes  ${drink.strIngredient3} - ${drink.strMeasure3} \n"
        else
            return ingredientes

        if (drink.strIngredient4 != "")
            ingredientes = "$ingredientes  ${drink.strIngredient4} - ${drink.strMeasure4} \n"
        else
            return ingredientes

        if (drink.strIngredient5 != "")
            ingredientes = "$ingredientes  ${drink.strIngredient5} - ${drink.strMeasure5} \n"
        else
            return ingredientes

        if (drink.strIngredient6 != "")
            ingredientes = "$ingredientes  ${drink.strIngredient6} - ${drink.strMeasure6} \n"
        else
            return ingredientes

        if (drink.strIngredient7 != "")
            ingredientes = "$ingredientes  ${drink.strIngredient7} - ${drink.strMeasure7} \n"
        else
            return ingredientes

        if (drink.strIngredient8 != "")
            ingredientes = "$ingredientes  ${drink.strIngredient8} - ${drink.strMeasure8} \n"
        else
            return ingredientes

        if (drink.strIngredient9 != "")
            ingredientes = "$ingredientes  ${drink.strIngredient9} - ${drink.strMeasure9} \n"
        else
            return ingredientes

        if (drink.strIngredient10 != "")
            ingredientes = "$ingredientes  ${drink.strIngredient10} - ${drink.strMeasure10} \n"
        else
            return ingredientes

        if (drink.strIngredient11 != "")
            ingredientes = "$ingredientes  ${drink.strIngredient11} - ${drink.strMeasure11} \n"
        else
            return ingredientes

        if (drink.strIngredient12 != "")
            ingredientes = "$ingredientes  ${drink.strIngredient12} - ${drink.strMeasure12} \n"
        else
            return ingredientes

        if (drink.strIngredient13 != "")
            ingredientes = "$ingredientes  ${drink.strIngredient13} - ${drink.strMeasure13} \n"
        else
            return ingredientes

        if (drink.strIngredient14 != "")
            ingredientes = "$ingredientes  ${drink.strIngredient14} - ${drink.strMeasure14} \n"
        else
            return ingredientes

        if (drink.strIngredient15 != "")
            ingredientes = "$ingredientes  ${drink.strIngredient15} - ${drink.strMeasure15} \n"
        else
            return ingredientes

        return ingredientes
    }


}