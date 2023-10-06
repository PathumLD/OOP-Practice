//can create methods with same name, but should apply different parameters

package Polymorphism.MethodOverloading;

public class Meth_Overloading {

    public void meth(){
        System.out.println("Method 1");
    }
    public void meth(int x){
        System.out.println("Method 1");
    }
    public void meth(int x, int y){
        System.out.println("Method 1");
    }
    public void meth(double x){
        System.out.println("Method 1");
    }

    public static void main(String[] args) {
        Meth_Overloading obj1 = new Meth_Overloading();
        obj1.meth();

        //or
        Meth_Overloading obj1 = new Meth_Overloading();
        obj1.meth(5);

        //or
        Meth_Overloading obj1 = new Meth_Overloading();
        obj1.meth(2,4);

        //or
        Meth_Overloading obj1 = new Meth_Overloading();
        obj1.meth(7.5);
    }
}
