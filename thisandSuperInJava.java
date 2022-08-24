
//this and super keyword in java

class Abc
{
void sum(){
 int a,b;
 a=0;b=5;
 int c=a+b;
 System.out.println("The sum is : "+c);
}

}
class Xyz extends Abc
{
    void sum(){ 
    int a,b;
         a=50;b=20;
         int c=a+b;
        System.out.println("The sum is : "+c);

       }

       void print(){
        super.sum();
       }

}

public class thisandSuperInJava {

    public static void main(String[] args) {
        Xyz x=new Xyz();
        x.print();
        
    }
}