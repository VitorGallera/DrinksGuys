package com.prova2.vitorgallera.drinksguys.scenarios_main.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/prova2/vitorgallera/drinksguys/scenarios_main/main/MainContract;", "", "Presenter", "View", "app_debug"})
public abstract interface MainContract {
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/prova2/vitorgallera/drinksguys/scenarios_main/main/MainContract$View;", "", "hideLoading", "", "showList", "drinks", "", "Lcom/prova2/vitorgallera/drinksguys/entites/Drink;", "showLoading", "showMessage", "msg", "", "app_debug"})
    public static abstract interface View {
        
        public abstract void showMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String msg);
        
        public abstract void showList(@org.jetbrains.annotations.NotNull()
        java.util.List<com.prova2.vitorgallera.drinksguys.entites.Drink> drinks);
        
        public abstract void showLoading();
        
        public abstract void hideLoading();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/prova2/vitorgallera/drinksguys/scenarios_main/main/MainContract$Presenter;", "", "onLoadList", "", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void onLoadList();
    }
}