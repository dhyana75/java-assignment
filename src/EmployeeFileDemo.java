import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class EmployeeFileDemo {
    public static void main(String[] args) {

        try {
            // Writing employee details to file
            FileWriter writer = new FileWriter("employee.txt");

            writer.write("Employee ID: 201\n");
            writer.write("Employee Name: Rohan\n");
            writer.write("Department: Computer Science\n");
            writer.write("Salary: 35000\n");

            writer.close();

            System.out.println("Employee details written to file.");

            // Reading employee details from file
            FileReader reader = new FileReader("employee.txt");
            BufferedReader buffer = new BufferedReader(reader);

            String line;

            System.out.println("\nEmployee Details:");

            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }

            buffer.close();
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while handling the file.");
        }
    }
}