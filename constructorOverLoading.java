class constructorOverLoading{
    int id;
    String name;
    int age;

 constructorOverLoading(int i,String n){

    id=i;
    name=n;

 }

 constructorOverLoading(int i,String n,int a){
    id=i;
    name=n;
    age=a;

 }
 void display(){
    System.out.println(" id = "+id+"\n name = "+name+"\n age = "+age);;
 }

 public static void main(String[] args) {
    constructorOverLoading c1=new constructorOverLoading(1,"harendra");
    constructorOverLoading c2=new constructorOverLoading(1, "harendra",23);
    c1.display();
    c2.display();
 }



}