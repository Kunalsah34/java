import java.util.ArrayDeque;
import java.util.Deque;

public class javaDequeExample{
    public static void main(String[] args){

        Deque<Integer> obj = new ArrayDeque<Integer>();

        obj.add(1);
        obj.add(2);
        obj.add(3);

        System.out.println("Inserting elements are: ");
        for(Integer integer : obj){
            System.out.println(integer);
        }

        obj.pop();
        
        //popping the elements;
        System.out.println("After poping; ");
        System.out.println("Deque are: "+ obj);

        // obj.remove(3);

        System.out.println("Removeing the element 3: "+ obj);

    }
}