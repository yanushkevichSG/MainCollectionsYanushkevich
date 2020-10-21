package by.javatr.task4.entity;

import by.javatr.task4.service.VegetableCategory;

public class RootVegetable extends Vegetable {

    public RootVegetable(String name, VegetableCategory category, int kCal, double weight) {
        super(name, category, kCal, weight);
    }

    public RootVegetable(String name, int kCal) {
        super(name, kCal);
    }

    public RootVegetable(String name, int kCal, double weight) {
        super(name, kCal, weight);
    }
}
