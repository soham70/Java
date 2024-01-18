package JavaCollections;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<String, String>();

        names.put("Soham", "Sheth");
        names.put("John", "Doe");
        names.put("ASD", "SWE");
        names.put("John", "Doe");

        System.out.println(names);

        System.out.println(names.get("Soham"));

    }
}
