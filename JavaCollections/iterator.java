package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Innova");
        cars.add("Mazda");
        cars.add("Lambo");

        Iterator<String> it =cars.iterator();

        System.out.println(it.next());

        while(it.hasNext()) {
            System.out.println(it.next());
          }
    }
}
