import java.util.Scanner;

public class switchCase {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 to check odd or even");
        System.out.println("press 2 for Addition");
        System.out.println("press 3 for substraction");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("here ve will check number is odd or even ");
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Please Enter the value ");
                int oddeve = sc1.nextInt();
                if (oddeve % 2 == 0) {
                    System.out.println(" " + oddeve + " :is even");

                } else {
                    System.out.println(" " + oddeve + " :is odd");
                }

                // break;

            case 2:
                System.out.println("here ve will add two number   ");

                Scanner sc2 = new Scanner(System.in);
                System.out.print("Enter the first value   : ");
                int val1 = sc2.nextInt();
                System.out.print("Enter the second value   : ");
                int val2 = sc2.nextInt();

                int sum = (val1 + val2);
                System.out.println("the sum is " + sum);
                // break;

            case 3:
                System.out.println("here ve will substract two number   ");

                Scanner sc3 = new Scanner(System.in);
                System.out.print("Enter the first value   : ");
                int val3 = sc3.nextInt();
                System.out.print("Enter the second value   : ");
                int val4 = sc3.nextInt();

                int minus = (val3 - val4);
                System.out.println("the sum is " + minus);

                break;
        }
        sc.close();

    }
}
