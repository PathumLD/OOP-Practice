package Polymorphism.MethodOverriding;

public class Child extends Parent{

    //If this method is not here.output will be Samsung.
    public void Phone(){
        System.out.println("Nokia");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.Phone();
    }
}
