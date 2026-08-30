import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class PatientFileDemo {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("patient.txt");

            writer.write("Patient ID: 501\n");
            writer.write("Patient Name: Ananya\n");
            writer.write("Age: 25\n");
            writer.write("Diagnosis: Fever\n");

            writer.close();

            System.out.println("Patient details written to file.");

            FileReader reader = new FileReader("patient.txt");
            BufferedReader buffer = new BufferedReader(reader);

            String line;

            System.out.println("\nPatient Details:");

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