package br.com.cod3r.builder.meal.functional;

import br.com.cod3r.builder.meal.functional.model.FastFoodMeal;

public class Client {

    public static void main(String[] args) {
        FastFoodMeal burguerCombo = new FastFoodMeal.Builder("Fries")
                .andMain("CheeseBurger")
                .forDrink("Code")
                .thatsAll();

    }

}
