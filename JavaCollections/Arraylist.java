package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Brezza");
        cars.add("Nexon");
        System.out.println(cars);
        String Getcar = cars.get(0);
        System.out.println(Getcar);
        cars.set(0, "Opel");
        System.out.println(cars);
        cars.add("Kia");
        cars.add("Creta");
        System.out.println(cars);

        cars.remove(3);
        System.out.println(cars);

        // cars.clear() Removes all Elements from arraylist

        System.out.println(cars.size());

        // Looping through arraylist

        for (String i : cars) {
            System.out.println(i);
        }

        Collections.sort(cars);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (String i : cars) {
            System.out.println(i);
        }
    }

}
