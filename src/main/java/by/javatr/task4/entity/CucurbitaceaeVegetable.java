package by.javatr.task4.entity;

import by.javatr.task4.service.VegetableCategory;

public class CucurbitaceaeVegetable extends Vegetable {


    public CucurbitaceaeVegetable(String name, VegetableCategory category, int kCal, double weight) {
        super(name, category, kCal, weight);
    }

    public CucurbitaceaeVegetable(String name, VegetableCategory category) {
        super(name, category);
    }

    public CucurbitaceaeVegetable(String name, int kCal, double weight) {
        super(name, kCal, weight);
    }

    public CucurbitaceaeVegetable(String name, int kCal) {
        super(name, kCal);
    }
}
