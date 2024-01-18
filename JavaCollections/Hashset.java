package JavaCollections;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args)
    {
        HashSet<String> cars=new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Brezza");
        cars.add("Nano");
        cars.add("Rx100");

        System.out.println(cars);

        System.out.println(cars.contains("Volvo"));

        for (String i:cars)
        {
            System.out.println(i);
        }


    }
}
