package Lesson4;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog("Jack");
        dog.run(130);
        dog.swim(190);

        Animal cat = new Cat("Dorothy", 10);
        cat.run(10);
        cat.swim(150);

        Cat[] catsArray = {
                new Cat("Asia", 5),
                new Cat("Bella", 5),
                new Cat("Tishka", 5),
                new Cat("Barsik", 5)
        };

        Plate plate = new Plate(10);
        plate.increaseFood(5);
        feedCats(catsArray, plate);

        Payment.Product[] products = {
                new Payment.Product(12, "Milk"),
                new Payment.Product(20, "Bread")
        };
        Payment payment = new Payment(products);
        payment.process();

        Park.Entertainment[] entertainments = {
                new Park.Entertainment(12.50, "roundabout", 5),
                new Park.Entertainment(10.20, "trampoline", 5)
        };
        Park park = new Park(entertainments);
        park.info();
    }

    public static void feedCats(Cat[] catsArray, Plate plate) {
        for (Cat cat : catsArray) {
            cat.eat(plate);
            if (cat.isSatiety()) {
                System.out.println(cat.getName() + " is fed!");
            } else {
                System.out.println(cat.getName() + " is hungry!");
            }
        }
    }
}