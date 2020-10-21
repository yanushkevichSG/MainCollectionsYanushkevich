package by.javatr.task4.entity;

import by.javatr.task4.service.VegetableCategory;

public class Beta extends RootVegetable {
    private static String name = "Beta";
    private static VegetableCategory category = VegetableCategory.Root;
    private static int kCal = 32;

    public Beta() {
        super(name,  kCal);
    }

    public Beta(double weight) {
        super(name, category, kCal, weight);
    }
}
