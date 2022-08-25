class Addition{
void sum(int a,int b){
    System.out.println(a+b);

}
void sum(int a,int b ,int c){
    System.out.println(a+b+c);

}
}

public class overlLoading {
    public static void main(String[] args) {
        Addition a=new Addition();
        a.sum(10, 20,40);
    }
    
}
