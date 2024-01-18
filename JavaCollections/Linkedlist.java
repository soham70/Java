package JavaCollections;

import java.util.LinkedList;
import java.util.Collections;


public class Linkedlist {
    public static void main(String[] args)
    {
        LinkedList<Integer> num =new LinkedList<Integer>();
        num.add(20);
        num.add(50);
        num.add(70);
        num.add(10);
        num.add(30);
        num.add(90);
        System.out.println(num);

        num.remove(2);

        System.out.println(num.removeFirst());
        System.out.println(num.removeLast());
        System.out.println(num.getFirst());
        System.out.println(num.getLast());
        num.addFirst(60);
        num.addLast(100);

        System.out.println(num);

        Collections.sort(num);

        System.out.println(num);
    }
}
