import java.util.ArrayList;
import java.util.Collections;


public class Arraylist_Program {

public static void main(String[] args)
{
    ArrayList<String> fruits =new ArrayList<>();
    fruits.add("Grapes");
    fruits.add("Mango");
    fruits.add("Apple");
    fruits.add("Kiwi");


    System.out.println(fruits.get(0));

    fruits.set(0,"Banana");
    System.out.println(fruits.get(0));
    fruits.remove(0);
    System.out.println(fruits);
    System.out.println(fruits.size());
//    fruits.clear();;
//    System.out.println(fruits);

    fruits.add("Grapes");
    fruits.add("Watermelon");

    for(String i :fruits)
    {
        System.out.println(i);
    }

    //Sorting the list
    Collections.sort(fruits);
    System.out.println(fruits);




}


}
