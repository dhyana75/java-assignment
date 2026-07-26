public class StudentMarks {

    public void calculateTotal(String m1, String m2, String m3) {

        int mark1 = Integer.parseInt(m1);
        int mark2 = Integer.parseInt(m2);
        int mark3 = Integer.parseInt(m3);

        int total = mark1 + mark2 + mark3;

        System.out.println("Mark 1 = " + mark1);
        System.out.println("Mark 2 = " + mark2);
        System.out.println("Mark 3 = " + mark3);
        System.out.println("Total Marks = " + total);
    }

    public static void main(String[] args) {

        StudentMarks s = new StudentMarks();

        s.calculateTotal("85", "90", "78");
    }
}