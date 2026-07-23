public class Calculator {
    int num1 = 20;
    int num2 = 10;



    public static void main(String[] args){
        Calculator m = new Calculator();
        m.mul();
        m.div();
        m.add();
        m.add(1,2);
        m.add(2,4,5);

    }


    void add()
    {
        int res = num1 + num2;
        System.out.print("Sum of num1 and num2 is: ");
        System.out.println(res);
    }


    void add(int a, int b){
        System.out.println("Sum of a and b is:" + (a + b));
    }
    void add(int a, int b, int c ){
        System.out.println("Sum of a, b and c is: " +(a+b+c));
    }


    void mul()
    {
        int res = num1 * num2;
        System.out.print("Product is: ");
        System.out.println(res);
    }

    void div()
    {
        int res = num1 / num2;
        System.out.print("Division is: ");
        System.out.println(res);
    }
}
