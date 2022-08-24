
class marks{
    int mark=80;
 }
class gradeInEnglish extends marks{
    void english(){
        if(mark>=80){
            System.out.println("grade in english is A");
        }else{
            System.out.println("grade is not A");
        }
    }
   
}

class gradeInMath extends marks{
    void math(){
        if(mark>=80){
            System.out.println("grade in math is B");
        }else{
            System.out.println("grade is not A");
        }
    }
   
}


class hirarchialInheritance{
    public static void main(String[] args) {
        gradeInEnglish g=new gradeInEnglish();
        g.english();
        gradeInMath g1=new gradeInMath();
        g1.math();
    }
}

