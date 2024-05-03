// import java.util.*;

// // hello and hi from kunal sah

// public class Qlist{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the elements of the list");
//         String s = sc.nextLine();

//         String[] elements = s.split(" ");
//         int size = elements.length;

//         System.out.println("Enter postion of element you want  to print");

//         int i = sc.nextInt();

//         try{
//             if(i>size){
//                 System.out.println("Postion is invalid");
//             }
//             for(int t=0; t<i; t++){
//                 System.out.println(elements[t]);
//             }
            
//             // System.out.println(elements[i]);

//         }catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("index bound of bound");

//         }

//     }
// }


import java.util.*;

// hello and hi from kunal sah
public class Qlist{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the elements of the list");
        String s = sc.nextLine();

        String[] elements = s.split(" ");
        int size = elements.length;


        System.out.println("Enter postion of element you want  to print");

        int p = sc.nextInt();

        try{
            if(p>size){
                System.out.println("Postion is invalid");
                return;
            }
            for(int t=0; t<size; t++){
                if(!(elements[t].equals(elements[p-1]))){
                    System.out.println(elements[t]);
                }else{
                    continue;
                }
            }
            
            // System.out.println(elements[i]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index bound of bound");

        }

    }
}