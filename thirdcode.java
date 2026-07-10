package Test3;
import java.io.*;
import java.util.Scanner;
public class Thirdcode {
    public static void writeNote(String fileName, String note) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(note + "\n");
        } catch (IOException e) {
            System.out.println("Error: Could not save note.");
        }
    }
}
