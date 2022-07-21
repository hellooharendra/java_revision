import java.util.Scanner;

public class ifelseConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();

        if (a + b > 50 && a + b < 100) {
            System.out.println("the sum is greater than 50");
        } else if (a + b > 0 && a + b < 50) {
            System.out.println("the sum is grater than 0");

        } else {
            System.out.println(" 0ut of range please enter correct value");

        }

    }

}
