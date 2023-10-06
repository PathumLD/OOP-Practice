public class Phone {

    String name;
    String color;
    int price;

    public void call() {
        System.out.println("Calling...");
    }

    public void browse() {
        System.out.println("Browsing...");
    }

    //Static vs Public
    //Static: belongs to the class
    //Public: belongs to the object

    static void staticMethod() {
        System.out.println("Static method");
    }

    public void publicMethod() {
        System.out.println("Public method");
    }

    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.name = "iPhone 12";
        p1.color = "Black";
        p1.price = 699;

        System.out.println(p1.name);
        System.out.println(p1.color);
        System.out.println(p1.price);

        p1.call();
        p1.browse();


        staticMethod();

        Phone.staticMethod();   //static method can be called by class name
    }


}
