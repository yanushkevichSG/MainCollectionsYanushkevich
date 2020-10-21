package by.javatr.task4.creator;

import by.javatr.task4.entity.Vegetable;

import java.lang.reflect.Constructor;

public class VegetableCreator {
    public static Vegetable vegetableCreator(String ingredientName, double weight) {
        try {
            Class [] parameters = {double.class};
            ingredientName = "by.javatr.task4.entity." + ingredientName;
            Class ingredientClass = Class.forName(ingredientName);
            Constructor constructor =
                    ingredientClass.getDeclaredConstructor(parameters);
            Vegetable vegetable = (Vegetable) constructor.newInstance(
                    new Object[]{new Double(weight)});
            return vegetable;
        }
        catch (Exception e) {
            System.out.println("No such ingredient!");

            return null;
        }
    }
}
