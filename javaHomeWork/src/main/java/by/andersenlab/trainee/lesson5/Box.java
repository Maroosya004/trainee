package by.andersenlab.trainee.lesson5;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0;
        } else {
            return fruits.size() * fruits.get(0).getWeight();
        }
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void pour(Box<T> box) {
        for (T fruit : fruits) {
            box.addFruit(fruit);
        }
        fruits.clear();
    }
}


