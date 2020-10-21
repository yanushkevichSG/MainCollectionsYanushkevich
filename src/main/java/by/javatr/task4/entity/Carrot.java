package by.javatr.task4.entity;

import by.javatr.task4.service.VegetableCategory;

public class Carrot extends RootVegetable {
    private static String name = "Carrot";
    private static VegetableCategory category = VegetableCategory.Root;
    private static int kCal = 35;

    public Carrot() {
        super(name,  kCal);
    }

    public Carrot(double weight) {
        super(name, category, kCal, weight);
    }


}
