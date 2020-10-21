package by.javatr.task4.entity;

import by.javatr.task4.service.VegetableCategory;

public class SpicyVegetable extends Vegetable {

    public SpicyVegetable(String name, VegetableCategory category, int kCal, double weight) {
        super(name, category, kCal, weight);
    }

    public SpicyVegetable(String name, VegetableCategory category) {
        super(name, category);
    }

    public SpicyVegetable(String name, int kCal, double weight) {
        super(name, kCal, weight);
    }

    public SpicyVegetable(String name, int kCal) {
        super(name, kCal);
    }
}
