import java.util.*;
import java.io.*;


public class file {
    public static void main(String[] args) {
        
        File file = new File("abc.txt");
        
        try{
            FileReader reader = new FileReader(file);
            FileWriter writer = new FileWriter(file);
            if(!file.exists()){
                System.out.println("file not found");
            }
            int ch;
            String s="";
            // writer.write("hello and hi from kkunal ");
            while((ch=reader.read())!= -1) {
                s=s+(char)ch;
                System.out.println("hello");
            }
            System.out.println(s);

            reader.close();
            writer.close();
        }catch(Exception e){
            System.out.println(e);
        }
        


    }
    
}
