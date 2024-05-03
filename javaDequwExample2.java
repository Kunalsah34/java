import java.util.*;



public class javaDequwExample2 {
    public static void main(String[] args) {
        
        Deque<String> deque = new ArrayDeque<String>();

        deque.addFirst("Java");
        System.out.println(" the first element is :"+ deque);

        deque.addFirst("C++");
        System.out.println("After add the element if the font side of deque : "+deque);

        deque.add("Python");
        System.out.println(" the final deque is : "+deque);

        //return the number of elements
        int size = deque.size();

        System.out.println(" the number of elements are: "+ size);

        //remove the last remove


    }
}
