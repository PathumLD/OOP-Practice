//Use of keyword "Static"

public class Test {
    String name;

    void call() {
        System.out.println("Take call from " + name);
    }

    public static void main(String[] args){

        Test phone1 = new Test();
        Test phone2 = new Test();
        Test phone3 = new Test();
        phone1.name = "Samsung";
        phone2.name = "iPhone";
        phone3.name = "Huawei";
        phone1.call();
        phone2.call();
        phone3.call();
    }

}