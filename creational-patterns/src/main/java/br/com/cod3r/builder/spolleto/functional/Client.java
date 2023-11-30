package br.com.cod3r.builder.spolleto.functional;

import br.com.cod3r.builder.spolleto.functional.model.Pasta;
import br.com.cod3r.builder.spolleto.functional.model.Size;


public class Client {

    public static void main(String[] args) {

        Pasta p1 = new Pasta.Builder(Size.SMALL)
                .withSauces("Tomato")
                .withToppings("Bacon", "Broccoli")
                .withPepper()
                .now();

        System.out.println(p1);

    }

}
