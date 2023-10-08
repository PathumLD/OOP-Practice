package File_Handling;


import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFile2 {
    public static void main(String[] args){
        String txt = "Me mage 2ni code eka";
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("file2.txt")); // filewriter oblect
            writer.append(txt);
            writer.newLine();
            writer.append(txt);
            writer.close();
            System.out.println("Done");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
