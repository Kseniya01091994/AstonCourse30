package org.example;
public class Cat extends Animal {
    private static int catCount = 0;
    private static final int MAX_RUN_DISTANCE = 200;
    private boolean isFull; // сытость

    public Cat(String name) {
        super(name);
        this.isFull = false; // коты голодные
        catCount++;
    }
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. Максимум: " + MAX_RUN_DISTANCE + " м.");
        }
    }
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eatFromBowl(Food food, int amount) {
        if (food.takeFood(amount)) {
            this.isFull = true;
            System.out.println(name + " поел " + amount + " еды и теперь сыт.");
        } else {
            System.out.println(name + " не смог поесть. В миске недостаточно еды.");
        }
    }
    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}

