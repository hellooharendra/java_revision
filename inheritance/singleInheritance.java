
class Student{
    int id=10;
    String name="harendra";

}
class StudentFee extends Student{
    int fee=60000;
}



class singleInheritance{
    public static void main(String[] args) {
        StudentFee sf=new StudentFee();
        System.out.println("id :"+sf.id);
        System.out.println("name :"+sf.name);
        System.out.println("fee :"+sf.fee);
    }

}