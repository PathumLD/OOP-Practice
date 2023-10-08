package File_Handling;

import java.io.File;
import java.util.Scanner;

public class ReadFile1 {
    public static void main(String[] args) {
        File file = new File("file1.txt");

        try{
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
