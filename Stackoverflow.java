public class stackoverflow {
    public static void main(String[] args) {
        Stackoverflow obj = new Stackoverflow();

        obj1.abc();

    }


    void abc(){
        xyz();
        int c = 30/0;
        System.out.println("Error1 "+ c);
        
    }


    void xyz(){
        int d = 30/0;
        System.out.println("Error2 "+ d);
    }
}
