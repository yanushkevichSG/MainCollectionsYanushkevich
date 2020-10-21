package by.javatr.task4.entity;

import by.javatr.task4.service.VegetableCategory;

public class Tomato extends NightShadeVegetable {
    private static String name = "Tomato";
    private static VegetableCategory category = VegetableCategory.NightShade;
    private static int kCal = 15;

    public Tomato() {
        super(name,  kCal);
    }

    public Tomato(double weight) {
        super(name, category, kCal, weight);
    }
}
