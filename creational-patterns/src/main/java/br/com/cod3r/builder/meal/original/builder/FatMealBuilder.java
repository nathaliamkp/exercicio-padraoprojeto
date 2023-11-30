package br.com.cod3r.builder.meal.original.builder;

public class FatMealBuilder extends FastFoodMealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("Milk Shake");
    }

    @Override
    public void buildMain() {
        meal.setMain("Double Cheeseburger");
    }

    @Override
    public void buildSide() {
        meal.setSide("Onion Rings");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Molten Cake");
    }

    @Override
    public void buildGift() {
        meal.setToy("Avengers Action Figure");
    }
}
