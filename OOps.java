import java.util.Scanner;

class Abc {
    Scanner sc = new Scanner(System.in);
    int a, b, c, d;

    void input() {

        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
    }

    void sum() {
        c = a + b;

    }

    void minus() {
        d = a - b;

    }

    void print() {
        System.out.println("Sum is :" + c);

        System.out.println("Minus is :" + d);

    }

}

public class OOps {
    public static void main(String[] args) {

        Abc A = new Abc();
        A.input();
        A.sum();
        A.minus();
        A.print();

    }

}
