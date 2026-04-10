import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StudentFileWriter {
    public static void main(String[] args) {
        File file = new File("students.txt");

        if (file.exists()) {
            System.out.println("Warning: students.txt already exists and will be overwritten.");
        }

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("John Doe 3.5 CS\n");
            writer.write("Jane Smith 3.8 IT\n");
            writer.write("Ali Khan 3.2 Math\n");
            writer.write("Sara Lee 3.9 Physics\n");
            writer.write("Mike Brown 2.9 Engineering\n");

            System.out.println("File written successfully.");
        }
        catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}