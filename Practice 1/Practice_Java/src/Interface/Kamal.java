package Interface;

public class Kamal implements Student{

    public void eat(){
        System.out.println("Eating");
    }
    public void run(){
        System.out.println("Running");
    }
    public void drink(){
        System.out.println("Drinking");
    }

    public static void main(String[] args){
        Kamal x = new Kamal();
        x.drink(); //x.run(); x.eat();

        Student y = new Kamal();
        System.out.println(Student.number); // or can y.eat();, y.drink();, y.run();
    }
}
