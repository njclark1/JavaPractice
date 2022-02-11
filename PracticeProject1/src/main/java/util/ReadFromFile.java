package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void ReadFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("text.txt"));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }

}
