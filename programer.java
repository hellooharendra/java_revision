class salary{
int salary =40000;
}
public class programer extends salary {
   int  bonus =10000;
   public static void main(String[] args) {
    programer p=new programer();
    System.out.println("salary is : "+p.salary);
    System.out.println("bonus is : "+p.bonus);
      
   }

}

