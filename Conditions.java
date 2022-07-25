 class ifStmt{
   int a=0;
   int b=3000;
   
   int c=a+b;
   void ifStmt(){
    if(c >10){
        
        System.out.println("the sum is :"+c);
 
    }else if(c==10){
        System.out.println(" c is 10");
    }
    else{
        System.out.println("error....please try again");
    }
   }

}

public class Conditions {
    public static void main(String[] args) 
    {
         ifStmt x1 =new ifStmt();
         x1.ifStmt();

        
    }
    
}
