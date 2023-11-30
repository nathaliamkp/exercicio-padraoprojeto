package br.com.cod3r.builder.restaurante.original.builder;

public class PicadinhoMealBuilder extends MealBuilder {

    @Override
    public void buildSuco() {
        meal.setSuco("Suco de Laranja");
    }

    @Override
    public void buildPratoPrincipal() {
        meal.setPratoPrincipal("Picadinho de Carne");
    }

    @Override
    public void buildAcompanhamento() {
        meal.setAcompanhamento("Arroz, Feijão, Farofa e Batata Frita");
    }

    @Override
    public void buildSobremesa() {
        meal.setSobremesa("Pudim");

    }
}
