 class studentInfo{
    int rollno;
    String name;
    float fee;
    studentInfo(int rollno,String name,float fee){

        this.rollno=rollno;
        this.name=name;
        this.fee=fee;

    }
    void display(){
        
        System.out.print(rollno+" "+name+" "+fee+"\n");
    }
}
class useOfthis{
    public static void main(String[] args) {
        studentInfo info=new studentInfo(1,"harendra", 60000);
        studentInfo info2=new studentInfo(2,"vinayak", 70500);
        info.display();
        info2.display();
    }


}
