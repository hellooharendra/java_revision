public class StmtNested {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        if(a==10){
            int c=a+b;
            if(c>20){
                System.out.println("the sum is " +c);
            }else{
                System.out.println("c is less than 20");
            }

        }else{
            System.out.println("c is less than 20");
        }
    }
    
}
