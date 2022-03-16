package by.andersenlab.trainee.lesson5;

import java.util.ArrayList;

public class Box<T extends Fruit> implements Comparable {

    private ArrayList<T> fruits = new ArrayList<>();
    private float totalWeight;
    Box<Apple> appleBox = new Box<>();
    Box<Apple> orangeBox = new Box<>();
    Apple apple = new Apple(1.0f);
    Orange orange = new Orange(1.5f);

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getTotalWeight(Fruit fruit) {
        totalWeight = fruits.size() * fruit.getWeight();
        return totalWeight;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public boolean compare(Box<Apple> appleBox, Box<Orange> orangeBox) {
        if (appleBox.getTotalWeight(apple) == orangeBox.getTotalWeight(orange)) {
            return true;
        } else {
            return false;
        }
    }
}


