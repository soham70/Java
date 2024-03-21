import java.util.LinkedList;
import java.util.Collections;


public class LinkedList_Program {

    public static void main(String[] args)
    {
        LinkedList<String>countries = new LinkedList<>();

        //Adding elements to List
        countries.add("India");
        countries.add("USA");
        countries.add("UK");
        countries.add("New Zealand");
        countries.add("Israel");

        System.out.println(countries);

        //using addFirst and addLast Method
        countries.addFirst("Australia");
        countries.addLast("Singapore");

        System.out.println(countries);

        //using removeFirst and removeLast method
        countries.removeFirst();
        countries.removeLast();

        System.out.println(countries);

        //using getFirst and getLast
        System.out.println(countries.getFirst());
        System.out.println(countries.getLast());

        //sorting List
        Collections.sort(countries);

        System.out.println(countries);




    }



}
