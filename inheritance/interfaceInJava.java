interface Harendra{
    String name="harendra";
    long id=1210259022;
    
}
class Display implements Harendra{
    String  rolle="Java Developer";

}

class interfaceInjava {

    public static void main(String[] args) {
        Display d=new Display();
        System.out.println("emp. id  :"+d.id);
        System.out.println("Name is : "+d.name);
        System.out.println("degignation : " +d.rolle);
        
    }

}