package Lesson4;

public class Dog extends Animal {

    private static final int RUNNING_LIMIT = 500;
    private static final int SWIMMING_LIMIT = 10;
    public static int dogsAmount = 0;

    public Dog(String name) {
        super(name);
        dogsAmount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= RUNNING_LIMIT) {
            System.out.println(getName() + " ran " + distance);
        } else {
            System.out.println(getName() + " can not run more than " + RUNNING_LIMIT);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= SWIMMING_LIMIT) {
            System.out.println(getName() + " swam " + distance);
        } else {
            System.out.println(getName() + " can not swim more than " + SWIMMING_LIMIT);
        }
    }
}
