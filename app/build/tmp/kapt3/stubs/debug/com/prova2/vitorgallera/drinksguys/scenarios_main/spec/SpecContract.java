package com.prova2.vitorgallera.drinksguys.scenarios_main.spec;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/prova2/vitorgallera/drinksguys/scenarios_main/spec/SpecContract;", "", "Presenter", "View", "app_debug"})
public abstract interface SpecContract {
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/prova2/vitorgallera/drinksguys/scenarios_main/spec/SpecContract$View;", "", "showDrinkDetail", "", "drinks", "", "Lcom/prova2/vitorgallera/drinksguys/entites/Drink;", "showMessage", "msg", "", "app_debug"})
    public static abstract interface View {
        
        public abstract void showMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String msg);
        
        public abstract void showDrinkDetail(@org.jetbrains.annotations.NotNull()
        java.util.List<com.prova2.vitorgallera.drinksguys.entites.Drink> drinks);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/prova2/vitorgallera/drinksguys/scenarios_main/spec/SpecContract$Presenter;", "", "onLoadDrink", "", "id", "", "onLoadRandomDrink", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void onLoadDrink(int id);
        
        public abstract void onLoadRandomDrink();
    }
}