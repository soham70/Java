import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_program {

    public static void main(String[] args)
    {
        //creating arraylist collection
        ArrayList<String>fruits=new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Kiwi");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Jackfruit");

//        System.out.println(fruits);

        //creating the iterator
        Iterator<String> it = fruits.iterator();

        //printing item using iterator
        System.out.println(it.next());

        //Looping through the iterator
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }

        while (it.hasNext()) {
            String s = it.next();

            if (s.equals("Jackfruit")) {
                it.remove();
            }
        }

        System.out.println(fruits);

    }
}
