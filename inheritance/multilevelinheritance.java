class name{
    String name="harendra";
}
class collage extends name{
    String collage="bbdu";
}
class fee extends collage{

    int fee=60000;

}
public class multilevelinheritance {
    public static void main(String[] args) {
        fee f=new fee();
    System.out.println(f.name);
    System.out.println(f.collage);
    System.out.println(f.fee);
    }
    
}
