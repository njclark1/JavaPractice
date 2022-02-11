package util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void WriteFile() throws IOException {
        BufferedWriter myFile = new BufferedWriter(new FileWriter("text.txt", true));
        myFile.newLine();
        myFile.append("wow");
        System.out.println("wrote to file");
        myFile.close();


    }
}
