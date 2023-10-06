package AccessModifier_2.Pack1;

public class Kamal {
    public int x=10;  //public
    int y = 20;  //default
    protected int z=30;  //protected

    private int a = 40;  //private

    public static void main(String[] args){
        Kamal obj1 = new Kamal();

        //Can access
        obj1.x;
        obj1.a;
        obj1.y;
        obj1.z;
    }
}
