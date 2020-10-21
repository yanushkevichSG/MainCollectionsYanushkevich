package by.javatr.task4.entity;

import by.javatr.task4.comparator.CaloriesComparator;
import by.javatr.task4.comparator.WeightComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Salad {
    private String name;
    private ArrayList<Vegetable> ingredients = new ArrayList<Vegetable>();

    public Salad() { this.name = "Sadness";}
    public Salad(String name) {
        this.name = name;
    }

    public Salad(String name, ArrayList<Vegetable> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Salad{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<?> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Vegetable> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean addIngredient(Vegetable vegetable) {
        return ingredients.add(vegetable);
    }

    public void removeIngredient(Vegetable vegetable) {

        ingredients.remove(vegetable);
    }

    public void showRecipe() {
        if (ingredients.isEmpty()) {
            System.out.println("You haven't added any ingredients yet!");
            return;
        }

        System.out.println("The salad " + name + " contains:");
        for (Vegetable vegetable : ingredients) {
            System.out.println(vegetable.toString());
        }
        System.out.println("----------------------------");
        System.out.println("Total energy: " + countCalories() + "kcal");
    }


    public double countCalories() {
        double calories = 0.0;

        for (Vegetable vegetable : ingredients) {
            calories += vegetable.getTotalkCal();
        }

        return calories;
    }

    public void sortIngredientsByCalories() {
        Collections.sort(ingredients, new CaloriesComparator());
    }

    public void sortIngredientsByWeight() {
        Collections.sort(ingredients, new WeightComparator());
    }

    public void showIngredientsByCalories(double lowerCalories,
                                          double upperCalories) {
        double calories;

        System.out.println("Ingredients for calories ["
                + lowerCalories + ", " + upperCalories + "]");
        for (Vegetable vegetable : ingredients) {
            calories = vegetable.getkCal();
            if (calories >= lowerCalories && calories <= upperCalories) {
                System.out.println(vegetable.getName() + ", "
                        + vegetable.getkCal() + "kcal per 100g");
            }
        }
    }
}
