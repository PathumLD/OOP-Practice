//Introduction to OOP

public class Phone {
    String name;
    String color;
    int price;

    public void call() {
        System.out.println("Take a call from" +" "+name);
    }

    public void browseInternet(){
        System.out.println("Browsing the internet");
    }

    public static void main(String[] args) {

        Phone phone1 = new Phone();
        phone1.name = "iPhone";
        phone1.color = "Black";
        phone1.price = 1000;
        phone1.call();
        phone1.browseInternet();

        Phone phone2 = new Phone();
        phone2.name = "Samsung";
        phone2.color = "Blue";
        phone2.price = 500;
        phone2.browseInternet();
        phone2.call();

    }
}