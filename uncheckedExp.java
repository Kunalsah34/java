
import java.io.*;

class uncheckedExp {

    public static void findFile(){
        throw new IOException("File not found");
    }



    public static void main(String[] args) {
        try {
            findFile();
            System.out.println("Rest of code in try block");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }
}