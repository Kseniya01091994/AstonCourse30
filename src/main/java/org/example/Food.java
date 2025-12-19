package org.example;
public class Food {
    private int foodAmount;

    public Food(int initialFood) {
        if (initialFood < 0) {
            this.foodAmount = 0;
        } else {
            this.foodAmount = initialFood;
        }
    }
    public boolean takeFood(int amount) {
        if (amount <= 0) {
            return false;
        }
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }
    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавлено " + amount + " еды. Теперь в миске: " + foodAmount + " еды.");
        }
    }
    public int getFoodAmount() {
        return foodAmount;
    }
}

