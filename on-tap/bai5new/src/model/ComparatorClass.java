package model;

import java.util.Comparator;

public class ComparatorClass implements Comparator<ClassSchool> {
    @Override
    public int compare(ClassSchool o1, ClassSchool o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
