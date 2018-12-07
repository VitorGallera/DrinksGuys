package com.prova2.vitorgallera.drinksguys.scenarios_main.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\u0016\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016\u00a8\u0006\u0012"}, d2 = {"Lcom/prova2/vitorgallera/drinksguys/scenarios_main/main/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/prova2/vitorgallera/drinksguys/scenarios_main/main/MainContract$View;", "()V", "hideLoading", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showList", "drinks", "", "Lcom/prova2/vitorgallera/drinksguys/entites/Drink;", "showLoading", "showMessage", "msg", "", "AppConstants", "app_debug"})
public final class MainActivity extends android.support.v7.app.AppCompatActivity implements com.prova2.vitorgallera.drinksguys.scenarios_main.main.MainContract.View {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void showList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.prova2.vitorgallera.drinksguys.entites.Drink> drinks) {
    }
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/prova2/vitorgallera/drinksguys/scenarios_main/main/MainActivity$AppConstants;", "", "()V", "DRINK_ID", "", "app_debug"})
    public static final class AppConstants {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DRINK_ID = "id";
        public static final com.prova2.vitorgallera.drinksguys.scenarios_main.main.MainActivity.AppConstants INSTANCE = null;
        
        private AppConstants() {
            super();
        }
    }
}