import java.util.HashSet;

public class Hashset_Program {
    public static void main(String[] args)
    {
        HashSet<String>sports = new HashSet<>();

        sports.add("Volleyball");
        sports.add("Cricket");
        sports.add("Badminton");
        sports.add("Hockey");
        sports.add("Baseball");

        System.out.println(sports);
        System.out.println(sports.contains("Cricket"));
        sports.remove("Hockey");
        System.out.println(sports);
//        sports.clear();
//        System.out.println(sports);'

        System.out.println(sports.size());

        for (String i:sports)
        {
            System.out.println(i);
        }

    }
}
