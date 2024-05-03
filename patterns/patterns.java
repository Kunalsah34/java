// // import java.util.*; 
// // public class patterns{
// //     public static void main(String[] args){

// //         Scanner sc = new Scanner(System.in);
// //         int n = sc.nextInt();
        

// //         for(int i=0; i<n; i++){
// //             for(int j=0; j<n; j++){
// //                 System.out.println("* " );
// //             }
// //             System.out.println();
// //         }

// //     }
// // }


// // hollow rectangle

// // * * * * * 
// // *       * 
// // *       * 
// // * * * * *

// import java.util.*; 
// public class patterns{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         int l = 4;
//         int b = 5;

//         for(int i=1; i<=l; i++){
//             for(int j=1; j<=b; j++){
//                 if(i == 1 || i==l || j==1 || j==b)
//                     System.out.print("* " );
//                 else 
//                     System.out.print("  " );
//             }
//             System.out.println();
                
//         }

//     }
// }




// Half Triangle

// * 
// * * 
// * * * 
// * * * * 



// import java.util.*; 
// public class patterns{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         int n = 4;


//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* " );
//             }
//             System.out.println();
                
//         }

//     }
// }






// Inverteted

// * * * * 
// * * * 
// * * 
// * 


// import java.util.*; 
// public class patterns{
//     public static void main(String[] args){

//         int n=4;
        
//         for(int i=n; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* " );
//             }
//             System.out.println();
                
//         }

//     }
// }



// Half triangle 180

//       * 
//     * * 
//   * * * 
// * * * *

public class patterns{
    public static void main(String[] args){

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
      
        int n=4;
        
        // for(int i=1; i<=n; i++){
            
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        for(int i=1; i<n; i++){
            for(int j=n; j>=1; j--){
                if(i>=j)
                    System.out.print(" * ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }



    }
}



//
// number half triangle

// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5


// public class Main{
//     public static void main(String[] args){
      
//         int n=4;
        
//         for(int i=1; i<=n; i++){
            
//             for(int j=1; j<=i; j++){
//                     System.out.print(j+" ");
                
//             }
            
//             System.out.println();
                
//         }

//     }
// }




// Inverted Half Pyramid with number

// 1 2 3 4 5 
// 1 2 3 4   
// 1 2 3     
// 1 2       
// 1      

// public class patterns{
//     public static void main(String[] args){
      
//         int n=5;
        
//         for(int i =1;  i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }







// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10       
// 11 12 13 14 15 


// public class patterns{
//     public static void main(String[] args){
          
//         int n=5;
//         int c=1;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(c+" ");
//                 c++;
//             }
//             System.out.println();

//         }
          
//     }
// }




// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

// public class patterns{
//     public static void main(String[] args){
          
//         int n=5;
    
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 int s=i+j;
//                 if(s%2==0)
//                     System.out.print("1 ");
//                 else
//                     System.out.print("0 ");

//             }
//             System.out.println();
//         }
          
//     }
// }

















