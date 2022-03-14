package Lesson4;

public abstract class Animal {

    private final String name;
    public static int animalsAmount = 0;

    public Animal(String name) {
        this.name = name;
        animalsAmount++;
    }

    abstract void run(int distance);
    abstract void swim(int distance);

    public String getName() {
        return name;
    }
}



