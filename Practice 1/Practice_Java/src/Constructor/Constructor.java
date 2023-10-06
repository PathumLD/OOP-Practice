package Constructor;//Constructor

public class Constructor {
    String name;

    Constructor(){
        name = "Kamal";
        System.out.println("Welcome");
    }

    void meth(){
        System.out.println("Hello");
    }

    public static void main (String[] args){
        Constructor obj = new Constructor();
        System.out.println(obj.name);
    }
}
