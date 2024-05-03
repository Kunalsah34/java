
import java.io.*;


// public class filehandling{
//     public static void main(String[] args) {

//         try{
//             FileOutputStream fout = new FileOutputStream("abc.txt");
//             BufferedOutputStream b1 = new BufferedOutputStream(fout);

//             String s = "Kunal sah";
//             byte b[] = s.getBytes();
//             b1.write(b);
//             b1.close();
//             fout.close();
//         } catch (FileNotFoundException e) {
//             e.printStackTrace();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }
       
public class filehandling{
    public static void main(String[] args) {

        try{
            FileInputStream fin = new FileInputStream("abc.txt");
            BufferedInputStream  b1 = new BufferedInputStream(fin);
            String s ="";
            int ch;
            while((ch = b1.read())!= -1){
                // System.out.print(s+(char)ch);
                s=s+(char)ch;
            }
            System.out.println(s);
            b1.close();
            fin.close();
        }catch(FileNotFoundException e){
            e.getStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
    }
}
       