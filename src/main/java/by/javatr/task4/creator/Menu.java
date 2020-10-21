package by.javatr.task4.creator;

import by.javatr.task4.entity.Salad;
import by.javatr.task4.entity.Vegetable;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private Salad salad;

    public Menu() {
        salad = new Salad();
    }
    public Menu(Salad salad) {
        this.salad = salad;
    }

    public Vegetable getIngredient(Scanner scanner) {
        String ingredientName;
        double weight;
        Vegetable vegetable;

        System.out.println("Enter the ingredient name:");
        ingredientName = scanner.next();
        System.out.println("Enter the weight (in gramms):");
        try {
            weight = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong weight!");
            scanner.next();
            return null;
        }

        vegetable = VegetableCreator.vegetableCreator(ingredientName, weight);
        return vegetable;
    }

    public void showIngredientsForCalories(Scanner scanner) {
        double lowerCalories, upperCalories;

        System.out.println("Enter the lower limit:");
        try {
            lowerCalories = scanner.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong input!");
            scanner.next();

            return;
        }

        System.out.println("Enter the upper limit:");
        try {
            upperCalories = scanner.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Wrong input!");
            scanner.next();

            return;
        }

        salad.showIngredientsByCalories(lowerCalories, upperCalories);
    }

    public void showOptions() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        Vegetable vegetable = null;

        while (choice != 0) {
            System.out.println("\nChoose one of the options:");
            System.out.println("1. Rename salad");
            System.out.println("2. Show recipe");
            System.out.println("3. Add ingredient");
            System.out.println("4. Sort ingredients by calories");
            System.out.println("5. Sort ingredients by weight");
            System.out.println("6. Get ingredients for calories");
            System.out.println("0. Exit");

            try {
                choice = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Wrong option!");
                scanner.next();
                choice = -1;
            }

            switch(choice) {
                case 1:
                    System.out.println("Name your salad:");
                    salad.setName(scanner.next());
                    break;

                case 2:
                    salad.showRecipe();
                    break;

                case 3:
                    vegetable = getIngredient(scanner);
                    if (vegetable != null) {
                        if (!salad.addIngredient(vegetable)) {
                            System.out.println("Cannot add ingredient!");
                        }
                    }
                    break;

                case 4:
                    salad.sortIngredientsByCalories();
                    break;

                case 5:
                    salad.sortIngredientsByWeight();
                    break;

                case 6:
                    showIngredientsForCalories(scanner);
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }

        scanner.close();
    }

}
