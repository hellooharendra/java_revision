class Abc{
    void print(){
        System.out.println("this is mathod before override");

    }
    
}
class Xyz extends Abc{
    void print(){
        System.out.println("this is mathod after override");
    }
}


public class overriding {
    public static void main(String[] args) {
        Xyz x=new Xyz();
        x.print();
    }
    
}
