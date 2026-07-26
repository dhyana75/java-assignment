class Student {
    String name;
    int rollNo;

    // Default Constructor
    Student() {
        name = "Dhyana";
        rollNo = 1;
    }

    // Parameterized Constructor
    Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        Student s2 = new Student("Riya", 2);

        System.out.println("Student 1:");
        s1.display();

        System.out.println();

        System.out.println("Student 2:");
        s2.display();
    }
}