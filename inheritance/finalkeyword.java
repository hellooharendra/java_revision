 final class Abc{
    void print(){
        System.out.println("hello harendra");
    }
}
// class Xyz extends Abc{ //its showing error because you can not inherrite final class//

// }

public class finalkeyword {
    public static void main(String[] args) {
        Abc a=new Abc();
        a.print();
    }
    
}
