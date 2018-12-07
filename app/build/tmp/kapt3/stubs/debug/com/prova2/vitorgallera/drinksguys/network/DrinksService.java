package com.prova2.vitorgallera.drinksguys.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/prova2/vitorgallera/drinksguys/network/DrinksService;", "", "getDrinks", "Lretrofit2/Call;", "Lcom/prova2/vitorgallera/drinksguys/entites/DrinksList;", "a", "", "getLookup", "i", "", "getRandon", "app_debug"})
public abstract interface DrinksService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "filter.php?")
    public abstract retrofit2.Call<com.prova2.vitorgallera.drinksguys.entites.DrinksList> getDrinks(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "a")
    java.lang.String a);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "random.php")
    public abstract retrofit2.Call<com.prova2.vitorgallera.drinksguys.entites.DrinksList> getRandon();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "lookup.php?")
    public abstract retrofit2.Call<com.prova2.vitorgallera.drinksguys.entites.DrinksList> getLookup(@retrofit2.http.Query(value = "i")
    int i);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public final class DefaultImpls {
    }
}