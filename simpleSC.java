import java.io.Console;
import java.util.Scanner;

public class simpleSC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int value = sc.nextInt();


        System.out.println("value is: "+value);
        
        // console c = System.console();
        Console c = System.console();
        System.out.println("Enter yout name");
        String s= c.readLine();
        System.out.println("Welcome "+s);



    }
}