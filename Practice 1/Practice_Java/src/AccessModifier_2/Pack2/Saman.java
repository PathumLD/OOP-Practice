package AccessModifier_2.Pack2;
import AccessModifier_2.Pack1.*;

public class Saman {
    public static void main(String[] args){
        Kamal obj3 = new Kamal();

        // can access
        obj3.x

        //Cannot access
        obj2.a
        obj2.y
        obj2.z
    }
}
