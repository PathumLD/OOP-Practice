package Encapsulation;

public class Main {

    public static void main(String[] args){
        Student obj = new Student();
        obj.setName("Pathum");
        System.out.println(obj.getName());
        obj.setAge(30);
        System.out.println(obj.getAge());
    }
}
