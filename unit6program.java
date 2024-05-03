import java.util.*;
// import java.util.Scanner;

public class unit6program {
    public static void main(String[] args) {
    


        Deque<Integer> d = new ArrayDeque<Integer>();

        d.add(7);
        d.add(2);
        d.add(3);
        d.add(5);
        d.add(7);
        System.out.println(d);
        // d.pop();
        d.removeLast();
        System.out.println(d);
    }
}
