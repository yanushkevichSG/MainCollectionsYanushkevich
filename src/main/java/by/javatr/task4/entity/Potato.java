package by.javatr.task4.entity;

import by.javatr.task4.service.VegetableCategory;

public class Potato extends NightShadeVegetable {
    private static String name = "Potato";
    private static VegetableCategory category = VegetableCategory.NightShade;
    private static int kCal = 77;

    public Potato() {
        super(name,  kCal);
    }

    public Potato(double weight) {
        super(name, category, kCal, weight);
    }
}
