package Inheritance;

//MULTIPLE INHERITANCE
//Can use all methods of OldPhone and LatestPhone classes
public class LatestPhone extends NewPhone{
    void camera(){

    }

    public static void main(String[] args) {
        LatestPhone obj3 = new LatestPhone();
        obj3.call();
    }
}

//in hierarchical inheritance use

//public static LatestPhone extends OldPhone
//Then we can't use methods in NewPhone class to LatestPhone class
