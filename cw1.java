
// interface p{
//     void show();
//     void display();
// }

// public class cw1 {
//     public static void main(String[] args){
        
//         p obj=()->{
//             public void show(){
//                 System.out.println("hello");
//             }
//             public void display(){
//                 System.out.println("hello form display");
//             }

//         };
        
//         obj.show();
//     }
// }



import java.util.*;

public class cw1{
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hey ");
        list.add("this ");
        list.add("is ");
        list.add("new.");

        list.forEach{
            (n)->System.out.println(n);
        };
    }
}




