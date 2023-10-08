package Exeptional_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionalHandling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        try{
            System.out.print("Enter first no :");
            a = sc.nextInt();
            System.out.print("Enter second no :");
            b = sc.nextInt();
            c = a/b;
            System.out.println("Answer is " +c);
        }
        catch(ArithmeticException e){
            System.out.println("Can't devide by zero");
        }
        catch(InputMismatchException e){
            System.out.println("Enter an integer number");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
