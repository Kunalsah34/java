interface A {
    void display();
}

class B implements A {
    @Override
    public void display() {
        System.out.println("Hello World");
    }
}

public class ab{
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}






// abstract class A {
//     abstract void display();

// }
// class B extends A{

//     @Override
//     void display(){
//         System.out.println("hello fro  B.");
//     }

// }

// class C extends A{
//     @Override
//     void display(){
//         System.out.println("hello from C.");
//     }
// }

// public class ab{
//     public static void main(String[] args) {
//         B obj1B = new B();
//         C obj1C = new C();

//         obj1B.display();
//     }
    
// }























