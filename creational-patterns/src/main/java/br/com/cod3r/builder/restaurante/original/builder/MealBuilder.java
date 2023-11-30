package br.com.cod3r.builder.restaurante.original.builder;


import br.com.cod3r.builder.restaurante.original.model.Meal;

public abstract class MealBuilder {

    protected Meal meal;

    public MealBuilder() {
        meal = new Meal();
    }

    public abstract void buildSuco();
    public abstract void buildPratoPrincipal();
    public abstract void buildAcompanhamento();
    public abstract void buildSobremesa();




}
