package Abstraction.this_keyword;

public class Student {
    String name;
    int age;

    Student(String name, int age){
        this.name = name;  //also can use name = x
        this.age = age;  //also can use age = y
    }

    public static void main(String[] args){
        Student obj = new Student("Pathum", 25);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
