package Super_keyword;

class Student{
    int age;
    String school;
    String email;
    Student(int age, String school, String email){
        this.age=age;
        this.school=school;
        this.email=email;
    }
}

class Kamal extends Student{
    int marks;
    Kamal(int age, String school, String email, int marks){
        super(age, school, email);
        this.marks=marks;
    }
}
public class Example {

    public static void main(String[] args){
        Kamal obj = new Kamal(15,"ABCD", "EFG", 85);
        System.out.println(obj.marks);

    }
}
