package File_Handling;

import java.io.File;

public class CreateFile {

    public static void main(String[] args){

        File obj = new File("file.txt");
        try{
            System.out.println(obj.createNewFile());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
