package by.javatr.task4.entity;

import by.javatr.task4.service.VegetableCategory;

public class Cucumber extends CucurbitaceaeVegetable {
    private static String name = "Cucumber";
    private static VegetableCategory category = VegetableCategory.Cucurbitaceae;
    private static int kCal = 16;

    public Cucumber() {
        super(name,  kCal);
    }

    public Cucumber(double weight) {
        super(name, category, kCal, weight);
    }
}
