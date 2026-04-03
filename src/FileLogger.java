import java.io.PrintWriter;
import java.util.Date;

public class FileLogger {

    public static void writeLog(String filename, String message) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(filename);
            writer.println(new Date() + " - " + message);

            // just for fun, throw a fake error
            throw new RuntimeException("Simulated write error");

        } finally {
            if (writer != null) {
                writer.close();
                System.out.println("Logger closed.");
            }
        }
    }

    public static void main(String[] args) {
        try {
            writeLog("app.log", "This is a test log message.");
        } catch (RuntimeException e) {
            System.out.println("Oops, something went wrong: " + e.getMessage());
        }
    }
}

/*
Notes:

- The 'finally' bit makes sure the writer always gets closed, no matter what weird stuff happens.