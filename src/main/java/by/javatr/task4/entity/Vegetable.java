package by.javatr.task4.entity;

import by.javatr.task4.service.VegetableCategory;

public class Vegetable {
    private String name;
    private VegetableCategory category;
    private int kCal;
    private double weight;

    public Vegetable(String name, VegetableCategory category, int kCal, double weight) {
        this.name = name;
        this.category = category;
        this.kCal = kCal;
        this.weight = weight;
    }

    public Vegetable(String name, VegetableCategory category) {
        this.name = name;
        this.category = category;
    }

    public Vegetable(String name, int kCal) {
        this.name = name;
        this.kCal = kCal;
    }

    public Vegetable(String name, int kCal, double weight) {
        this.name = name;
        this.kCal = kCal;
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "Vegetable{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", kCal=" + kCal +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vegetable vegetable = (Vegetable) o;

        if (Double.compare(vegetable.kCal, kCal) != 0) return false;
        if (Double.compare(vegetable.weight, weight) != 0) return false;
        if (!name.equals(vegetable.name)) return false;
        return category == vegetable.category;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + category.hashCode();
        temp = kCal;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getName() {
        return name;
    }

    public void VegetableName(String name) {
        this.name = name;
    }

    public VegetableCategory getCategory() {
        return category;
    }

    public void setCategory(VegetableCategory category) {
        this.category = category;
    }

    public int getkCal() {
        return kCal;
    }

    public void setkCal(int kCal) {
        this.kCal = kCal;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTotalkCal() {
        return kCal * weight / 100.0;
    }
}
