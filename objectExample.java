class Xyz {
    int a = 10, b = 20;

    void sum() {

        int c = a + b;
        System.out.println("sum is : " + c);

    }

    void print() {
        System.out.print("Hello...charms.. I am Harendra Prajapati");
    }

}

public class objectExample {
    public static void main(String[] args) {
        new Xyz().sum();// anonymous use of object
    }

}
