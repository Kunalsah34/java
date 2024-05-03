//  interface A{
//     int x=10;
//     void display();

// }
// class B implements A{
//     @Override
//     public void display(){
//         System.out.println("Hello World");
//     }
// }

// class C implements A{
//     @Override
//     public void display(){
//         System.out.println("Namaste ");
//     }
// }

// public class good{
//     public static void main(String[] args) {
        
//         A obj = new B();
//         obj.display();
//         System.out.println(obj.x);

//         C obj1 = new C();
//         obj1.display();
//     }
// }





interface anything{
    int x=10;
    void display();
    default int subtract(){
        return 10-5;
    }
    static int subtract1(){
        return 10-2;
    }
}

interface A extends anything{
    int sum();

}
interface B extends A{
    int square();

}

class C implements B{

    @Override
    public void display(){
        System.out.println("Hello World");
    }
    @Override
    public int sum(){
        return 5+5;

    }

    @Override
    public int square(){
        return 5*5;
    }
}
public class good{
    public static void main(String[] args) {
        B obj = new C();
        obj.display();
        
    }
}


