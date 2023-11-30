package br.com.cod3r.builder.restaurante.original.builder;

public class EstrogonofeMealBuilder extends MealBuilder {

    @Override
    public void buildSuco() {
        meal.setSuco("Suco de Laranja com Acerola");

    }

    @Override
    public void buildPratoPrincipal() {
        meal.setPratoPrincipal("Estrogonofe de Frango");

    }

    @Override
    public void buildAcompanhamento() {
        meal.setAcompanhamento("Arroz e Batata Palha");
    }

    @Override
    public void buildSobremesa() {
        meal.setSobremesa("Pudim de Chocolate");
    }
}
