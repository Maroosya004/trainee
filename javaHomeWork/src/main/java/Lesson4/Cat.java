package Lesson4;

public class Cat extends Animal {

    private static final int RUNNING_LIMIT = 200;
    public static int catsAmount = 0;

    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
        catsAmount++;
    }

    public void eat(Plate p) {
        if (p.getFood() < appetite) {
            System.out.println("There is not enough food");
        } else {
            p.decreaseFood(appetite);
            satiety = true;
        }
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
        System.out.println(getName() + " refused to swim");
    }

    public boolean isSatiety() {
        return satiety;
    }
}
