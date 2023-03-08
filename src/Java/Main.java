package Java;
 /*
 The jungle must be too overgrown and difficult to navigate in vehicles or access from the air;
 the Elves' expedition traditionally goes on foot. As your boats approach land, the Elves begin taking inventory
 of their supplies. One important consideration is food - in particular, the number of Calories each Elf is carrying
 (your puzzle input).

 The Elves take turns writing down the number of Calories contained by the various meals, snacks, rations, etc.
 that they've brought with them, one item per line. Each Elf separates their own inventory from the previous Elf's
 inventory (if any) by a blank line.
  */

import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TextReader textReader = new TextReader(new File("src/Java/calories.txt"));
        ArrayList<Elf> elfList = new ArrayList<>();
        textReader.countCalories(elfList);

        sort(elfList);
        for (Elf e : elfList) {
            System.out.println(e.toString());
        }
    }
    public static void sort(ArrayList<Elf> list) {
        list.sort(Elf::compareTo);
    }
}
