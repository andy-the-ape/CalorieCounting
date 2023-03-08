package Java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TextReader {
    private File caloriesFile;

    public TextReader(File filepath) {
        this.caloriesFile = filepath;
    }


    public void countCalories(ArrayList<Elf> elfList) {
        try {
            FileReader fr = new FileReader(caloriesFile);
            Scanner sc = new Scanner(fr);
            int elfCalories = 0;
            while (sc.hasNextLine()) {
                String calString = sc.nextLine();
                if (!Objects.equals(calString, "")) {
                    elfCalories += Integer.parseInt(calString);
                }
                else {
                    elfList.add(new Elf(elfCalories));
                    elfCalories = 0;
                }
            }
            sc.close();
            fr.close();
        }
        catch (IOException e) {
            System.out.println("Caught IOException.");
        }
    }
}
