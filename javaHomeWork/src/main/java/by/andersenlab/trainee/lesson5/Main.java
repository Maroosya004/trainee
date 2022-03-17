package by.andersenlab.trainee.lesson5;

public class Main {

    public static void main(String[] args) {
        String[] items = {"first", "second", "third"};

        ArrayUtils.swap(items, 0, 2);
        ArrayUtils.print(items);

        Box<Apple> appleBox = new Box<>();
        int applesAmount = 3;
        for (int i = 0; i < applesAmount; i++) {
            appleBox.addFruit(new Apple());
        }
        Box<Orange> orangeBox = new Box<>();
        int orangesAmount = 3;
        for (int i = 0; i < orangesAmount; i++) {
            orangeBox.addFruit(new Orange());
        }

        Box<Orange> newOrangesBox = new Box<>();
        orangeBox.pour(newOrangesBox);

        System.out.println("Total weight of the apple box: " + appleBox.getWeight());
        System.out.println("Total weight of the orange box: " + orangeBox.getWeight());
        System.out.println("Total weight of the new orange box: " + newOrangesBox.getWeight());
        System.out.println("Is the weight of the boxes equal? - " + appleBox.compare(orangeBox));
    }
}

