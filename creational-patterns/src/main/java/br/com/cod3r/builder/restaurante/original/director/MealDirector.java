package br.com.cod3r.builder.restaurante.original.director;

import br.com.cod3r.builder.restaurante.original.builder.MealBuilder;

public class MealDirector {

    private MealBuilder builder;

    public MealDirector(MealBuilder builder) {
        this.builder = builder;
    }
}
