import java.util.Scanner;

public class oddeven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int value1 = sc.nextInt();
        if (value1 % 2 == 0) {
            System.out.println("even");

        } else {
            System.out.println("odd");
        }

    }

}
