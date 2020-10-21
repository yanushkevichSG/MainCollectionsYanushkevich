package by.javatr.task4.entity;

import by.javatr.task4.service.VegetableCategory;

public class Dill extends SpicyVegetable {
    private static String name = "Dill";
    private static VegetableCategory category = VegetableCategory.Spicy;
    private static int kCal = 43;

    public Dill() {
        super(name,  kCal);
    }

    public Dill(double weight) {
        super(name, category, kCal, weight);
    }
}
