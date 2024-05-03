// import java.util.Scanner;
// public class ArrayException{

//     static int sum(int a, int b){
//         return a+b;
//     }


//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // int[] arr = new int[5];
//         int[] arr1 ={1,4, 10,7 ,13};

//         // for(int i=0; i<5; i++){
//         //     arr[i] = sc.nextInt();
//         // }

//         // for(int i=0; i<5; i++){
//         //     System.out.print(arr[i]+" ");
//         // }
//         // try {
//         //     System.out.println(arr1[5]);
//         // } catch (Exception e) {
//         //     // TODO: handle exception
//         //     System.out.println("Index out of range");
//         // }
//         //===============================================

//         String s = "HelloWorld";
        
//         // System.out.println(s.charAt(50));

//         try{
//             System.out.println(s.charAt(50));
//         }catch(Exception e){
//             System.out.println("Index out of range");
//         }

//         try{
//             // int c =sum(34,93.34);
//         }catch(Exception e){
//             System.out.println("unknow datatype");
//         }
        

//     }
// }







// import java.util.Scanner;
public class ArrayException{

    static int sum(int a, int b){
        return a+b;
    }

    class A{
        int a=34;
        A(int a){
            this.a = a;
        }
        void display(){
            System.out.println("hdhf= "+a);
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        

        // try{
        //     // int c =sum(34,93.34);
        // }catch(Exception e){
        //     System.out.println("unknow datatype");
        // }
        
            A obj = new A(234);
            try{
                // ABC obj = new ABC();
                
            }catch(Exception e){
                System.out.println("Class not found");
            }

    }
}
 