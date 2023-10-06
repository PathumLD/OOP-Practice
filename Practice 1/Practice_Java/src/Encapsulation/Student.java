package Encapsulation;

public class Student {
    private String name;
    private int age;


    //Getters & Setters
    public void setName(String name){  //can use String x
        this.name=name;  //name = x
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
