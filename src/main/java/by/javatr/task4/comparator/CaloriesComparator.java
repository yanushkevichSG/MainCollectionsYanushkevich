package by.javatr.task4.comparator;

import by.javatr.task4.entity.Vegetable;

import java.util.Comparator;

public class CaloriesComparator implements Comparator<Vegetable> {

    public int compare(Vegetable o1, Vegetable o2) {
        return (int) (o1.getkCal() - o2.getkCal());
    }
}
