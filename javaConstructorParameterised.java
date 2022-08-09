public class javaConstructorParameterised {

    javaConstructorParameterised(int a,int b){

        a=10;
        b=20;
       int c=a+b;
       System.out.println("The sum is : "+c);
       

    }

    javaConstructorParameterised(){
        System.out.println("This is second constructor");
    }
    public static void main(String[] args) {
        javaConstructorParameterised j1=new javaConstructorParameterised(10, 20);
        javaConstructorParameterised j=new javaConstructorParameterised();


    }
    
}
