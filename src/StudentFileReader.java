import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentFileReader {
    public static void main(String[] args) {
        int count = 0;

        try {
            File file = new File("students.txt");
            Scanner sc = new Scanner(file);

            // simple header
            System.out.println("First\tLast\tGPA\tMajor");
            System.out.println("-----------------------------");

            while (sc.hasNext()) {
                String first = sc.next();
                String last = sc.next();
                double gpa = sc.nextDouble();
                String major = sc.next();

                // just separate with tabs
                System.out.println(first + "\t" + last + "\t" + gpa + "\t" + major);
                count++;
            }

            sc.close();
            System.out.println("\nTotal students: " + count);
        }
        catch (FileNotFoundException e) {
            System.out.println("Oops! students.txt was not found.");
        }
    }
}