package File_Handling;

import java.io.File;

public class CreateFile {

    public static void main(String[] args){

        File obj = new File("file.txt");

        //Create file
//        try{
//            System.out.println(obj.createNewFile());
//        }catch(Exception e){
//            System.out.println(e);
//        }

        //Check if the file readable
//        try{
//            System.out.println(obj.canRead());
//        }catch(Exception e){
//            System.out.println(e);
//        }

        //Delete file
//        try{
//            if(obj.delete()){
//                System.out.println("Deleted successfully");
//            }else{
//                System.out.println("No any file");
//            }
//        }catch (Exception e){
//            System.out.println(e);
//        }
    }
}
