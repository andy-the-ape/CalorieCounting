package Java;

import java.util.Comparator;

public class Elf implements Comparable<Elf> {
    private int calories;

    public Elf(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return ("This elf is carrying ["+this.calories+"] calories.");
    }
    @Override
    public int compareTo(Elf e) {
        return Integer.compare(e.getCalories(), this.getCalories());
    }
}
