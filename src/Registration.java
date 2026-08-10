import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while (choice != 4) {

            System.out.println("\n--- Student Course Registration ---");
            System.out.println("1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("3. Remove Course");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter course name: ");
                String course = sc.nextLine();
                courses.add(course);
                System.out.println("Course added successfully.");

            } else if (choice == 2) {

                if (courses.size() == 0) {
                    System.out.println("No courses registered.");
                } else {

                    StringBuffer sb = new StringBuffer();
                    sb.append("Registered Courses:\n");

                    for (int i = 0; i < courses.size(); i++) {
                        sb.append((i + 1) + ". " + courses.get(i) + "\n");
                    }

                    System.out.println(sb);
                }

            } else if (choice == 3) {

                if (courses.size() == 0) {
                    System.out.println("No courses to remove.");
                } else {

                    System.out.println("Registered Courses:");
                    for (int i = 0; i < courses.size(); i++) {
                        System.out.println((i + 1) + ". " + courses.get(i));
                    }

                    System.out.print("Enter course number to remove: ");
                    int num = sc.nextInt();

                    if (num >= 1 && num <= courses.size()) {
                        courses.remove(num - 1);
                        System.out.println("Course removed successfully.");
                    } else {
                        System.out.println("Invalid course number.");
                    }
                }

            } else if (choice == 4) {

                System.out.println("Exiting...");

            } else {

                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}