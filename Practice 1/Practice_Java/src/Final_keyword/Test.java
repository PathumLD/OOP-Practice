package Final_keyword;

final class Parent{
    final public void say(){
        System.out.println("Hiiii");
    }
}

class Child extends Parent{  //since annot inherit it shows the error

}

public class Test {
    public static void main(String[] args){
        Child obj = new Child();
        obj.say();
    }
}
