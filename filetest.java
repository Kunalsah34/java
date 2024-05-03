import java.io.FileReader;
import java.nio.file.*;


public class filetest {
    public static void main(String[] args) {
        
        File file = new File("C:\Users\Galaxy\Desktop\Java CSE310\test.txt");
        FileReader reader = new FileReader(file);
        int character;
        while((character = reader.read())!= -1){
            System.out.println((char)character);
        }
        reader.close();
    }
}
