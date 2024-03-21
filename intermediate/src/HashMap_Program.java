import java.util.HashMap;
import java.util.Collections;

public class HashMap_Program {

    public static void main(String[] args)
    {
        HashMap<String,String> capitalCities= new HashMap<>();
        capitalCities.put("India","Delhi");
        capitalCities.put("England","London");
        capitalCities.put("USA","WDC");
        capitalCities.put("Australia","Sydney");
        capitalCities.put("SriLanka","Colombo");

        System.out.println(capitalCities);

        //Accessing elements in hashmap
        System.out.println(capitalCities.get("India"));

        //Removing elements from Array
        System.out.println(capitalCities.remove("SriLanka"));
        System.out.println(capitalCities);

        //Size of Hashmap
        System.out.println(capitalCities.size());

            //using keyset() method
        for(String i:capitalCities.keySet()) {
            System.out.println(i);
        }

        //using values() method
        for(String i : capitalCities.values())
        {
            System.out.println(i);
        }

        //getting both keys and value
        for(String i : capitalCities.keySet())
        {
            System.out.println("Key: " + i + " Value: "  + capitalCities.get(i));
        }

    }


}
