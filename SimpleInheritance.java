class A{
    
    void display(){
        System.out.println("This is class A ");
    }


}
class B extends A{
    
    void display(){
        super.display();
        System.out.println("This is class B ");

    }

}

class C extends B{
    void show(){
        System.out.println("This is class C ");
    }
}

public class SimpleInheritance{
    public static void main(String[] args){

        

        // A objA = new A(20);
        // objA.display();
        
        // B objB = new B();
        // objB.display1();
        // objB.display();

    }
}