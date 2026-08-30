import student.StudentInfo;
import faculty.FacultyInfo;

public class CollegePackageDemo {
    public static void main(String[] args) {

        StudentInfo student = new StudentInfo();
        FacultyInfo faculty = new FacultyInfo();

        System.out.println("STUDENT DETAILS");
        student.displayStudent();

        System.out.println();

        System.out.println("FACULTY DETAILS");
        faculty.displayFaculty();
    }
}