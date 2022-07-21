import java.util.Scanner;

public class gradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks in 100");
        int num = sc.nextInt();

        if (num >= 90) {
            System.out.println("grade is A");

        } else if (num >= 80 && num < 90) {
            System.out.println("grade is B");
        } else if (num >= 70 && num < 80) {
            System.out.println("grade is C");
        } else if (num >= 60 && num < 70) {
            System.out.println("grade is D");

        } else if (num >= 50 && num < 60) {
            System.out.println("grade is E");

        } else if (num < 50) {
            System.out.println("fail!...");
        } else {
            System.out.println("invalid.....");
        }
        sc.close();

    }

}
