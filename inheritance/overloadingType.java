
class Abc{
    int sum(int a,int b){
        return (a+b);
    }
    double sum(int a,int b ,long c){
        System.out.println("sum : "+(a+b+c));
    }
}

public class overloadingType {
    public static void main(String[] args) {
        Abc a=new Abc();
      System.out.println( a.sum(10,10,30));
    }
    
}
