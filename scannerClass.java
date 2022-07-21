import java.util.Scanner;

class input {
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    int age = sc.nextInt();
    double salary = sc.nextDouble();

    void print() {
        System.out.println("your name is :" + name);
        System.out.println("your age is :" + age);
        System.out.println("your salary is :" + salary);
    }
}

public class scannerClass {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        System.out.println("Please enter your age");
        System.out.println("Please enter your  salary");

        input obj = new input();
        obj.print();

    }

}
