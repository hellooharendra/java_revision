interface harendra{
 String First_name="harendra";
}
interface prajapati extends harendra{

String Last_name="Prajapati";
}
class Display implements prajapati{

}

public class interfaceInjava1{

    public static void main(String[] args) {
       Display p=new Display();
        System.out.println("First name : "+p.First_name);
        System.out.println("First name : "+p.Last_name);
    }
    
}
