public class ThrowExp {

    public static void divideByZero(){
        throw new ArithmeticException("try to divide by 0");
    }

    public static void main(String[] args) {
        divideByZero();
    }
}
