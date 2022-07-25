import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("select one number of the week (7day) like 1,2........7");
        int day=sc.nextInt();

        switch(day){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wedensday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:System.out.println("404!..error please select a correct number");
            break;

        }
    }
    
}
