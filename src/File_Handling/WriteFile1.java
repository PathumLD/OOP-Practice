package File_Handling;

import java.io.FileWriter;

public class WriteFile1 {
    public static void main(String[] args){
        String txt = " Pathum Lakshan Dissanayake";
        try{
            FileWriter write =new FileWriter("file1.txt", true);
            write.append(txt);
            write.close();
            System.out.println("Done");
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
