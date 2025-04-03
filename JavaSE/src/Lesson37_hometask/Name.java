package Lesson37_hometask;

import java.util.Comparator;

class Name implements Comparator<Name> {
    String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name [name=" + name + "]";
    }

    public String getName() {
        return name;
    }

    @Override
    public int compare(Name o1, Name o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
