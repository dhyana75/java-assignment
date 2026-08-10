import java.util.ArrayList;
import java.util.Scanner;

public class TodoListApp {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while (choice != 4) {

            System.out.println("\n--- TO-DO LIST ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter task: ");
                String task = sc.nextLine();
                tasks.add(task);
                System.out.println("Task added.");

            } else if (choice == 2) {

                if (tasks.size() == 0) {
                    System.out.println("No tasks available.");
                } else {
                    StringBuffer sb = new StringBuffer();

                    sb.append("Tasks:\n");

                    for (int i = 0; i < tasks.size(); i++) {
                        sb.append((i + 1) + ". " + tasks.get(i) + "\n");
                    }

                    System.out.println(sb);
                }

            } else if (choice == 3) {

                if (tasks.size() == 0) {
                    System.out.println("No tasks to remove.");
                } else {

                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }

                    System.out.print("Enter task number to remove: ");
                    int num = sc.nextInt();

                    if (num >= 1 && num <= tasks.size()) {
                        tasks.remove(num - 1);
                        System.out.println("Task removed.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                }

            } else if (choice == 4) {

                System.out.println("Thank you!");

            } else {

                System.out.println("Invalid choice.");

            }
        }

        sc.close();
    }
}