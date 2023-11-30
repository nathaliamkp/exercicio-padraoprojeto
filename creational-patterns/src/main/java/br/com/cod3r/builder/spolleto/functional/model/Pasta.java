package br.com.cod3r.builder.spolleto.functional.model;

import java.util.Arrays;
import java.util.List;

public class Pasta {

    private List<String> toppings;
    private List<String> sauces;
    private Size size;
    private boolean cheese;
    private boolean pepper;

    public Pasta(List<String> toppings, List<String> sauces, Size size, boolean cheese, boolean pepper) {
        this.toppings = toppings;
        this.sauces = sauces;
        this.size = size;
        this.cheese = cheese;
        this.pepper = pepper;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public void setSauces(List<String> sauces) {
        this.sauces = sauces;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isPepper() {
        return pepper;
    }

    public void setPepper(boolean pepper) {
        this.pepper = pepper;
    }

    @Override
    public String toString() {
        return "Pasta{" +
                "toppings=" + toppings +
                ", sauces=" + sauces +
                ", size=" + size +
                ", cheese=" + cheese +
                ", pepper=" + pepper +
                '}';
    }

    public static class Builder{

        private Size size;

        private List<String> toppings;
        private List<String> sauces;
        private boolean cheese;
        private boolean pepper;



        public Builder(Size size) {
            this.size = size;
        }

        public Builder withSauces(String... sauces) {
            this.sauces = Arrays.asList(sauces);
            return this;
        }

        public Builder withToppings(String... toppings) {
            this.toppings = Arrays.asList(toppings);
            return this;
        }

        public Builder withChese(){
            this.cheese = true;
            return this;
        }

        public Builder withPepper(){
            this.pepper = true;
            return this;
        }

        public Pasta now(){
            return new Pasta(toppings, sauces, size, cheese, pepper);
        }

    }

}
