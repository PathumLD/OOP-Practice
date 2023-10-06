package Constructor;//Constructor Overloading

public class Bank {
    int rupees;
    Bank(){
        rupees = 20;
    }
    Bank(int x){
        rupees = x;
    }

    public static void main(String[] args){

        Bank Kamal = new Bank();
        System.out.println(Kamal.rupees);
        Bank Nimal = new Bank(100);
        System.out.println(Nimal.rupees);
    }
}
