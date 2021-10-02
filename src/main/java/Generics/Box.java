package Generics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Box<F extends Fruit> {


    private List<F> fruits;

    public List<F> getFruits() {
        return fruits;
    }


    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void add(F Fruits) {
        this.fruits.add(Fruits);
    }



    public Box(F... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));



    }


    public float getWeight() {

        float weight = 0.0f;
        for (F fruit :
                fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean equalsBox(Box <?> anotherBox) {
        return Math.abs(getWeight() - anotherBox.getWeight()) < 0.001f;

    }

    public void transit(Box<F> anotherBox) {
        if (this == anotherBox) return;
        anotherBox.getFruits().addAll(fruits);
        fruits.clear();
    }
}
