class salary{
int salary =40000;
}
class programmer extends salary {
   int  bonus =10000;
   public static void main(String[] args) {
    programmer p=new programmer();
    System.out.println("salary is : "+p.salary);
    System.out.println("bonus is : "+p.bonus);

   }

}

