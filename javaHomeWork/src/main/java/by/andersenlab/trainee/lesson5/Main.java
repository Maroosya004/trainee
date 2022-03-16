package by.andersenlab.trainee.lesson5;

public class Main {

    public static void main(String[] args) {
        String[] items = {"first", "second", "third"};

        ArrayUtils.swap(items, 0, 2);
        ArrayUtils.print(items);

        Apple apple = new Apple(1.0f);
        Orange orange = new Orange(1.5f);

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(apple);
        appleBox.addFruit(apple);
        appleBox.addFruit(apple);
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(orange);
        orangeBox.addFruit(orange);
        orangeBox.addFruit(orange);
        System.out.println(appleBox.getTotalWeight(apple));
        System.out.println(orangeBox.getTotalWeight(orange));
        System.out.println(appleBox.getTotalWeight(apple) == orangeBox.getTotalWeight(orange));


    }
}

