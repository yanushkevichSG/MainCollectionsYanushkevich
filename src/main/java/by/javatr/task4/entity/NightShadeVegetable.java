package by.javatr.task4.entity;

import by.javatr.task4.service.VegetableCategory;

public class NightShadeVegetable extends Vegetable {


    public NightShadeVegetable(String name, VegetableCategory category, int kCal, double weight) {
        super(name, category, kCal, weight);
    }

    public NightShadeVegetable(String name, VegetableCategory category) {
        super(name, category);
    }

    public NightShadeVegetable(String name, int kCal, double weight) {
        super(name, kCal, weight);
    }

    public NightShadeVegetable(String name, int kCal) {
        super(name, kCal);
    }
}
