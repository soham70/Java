import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Hashmap_Assignment {

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int rollno,number;
        String sname;
        HashMap<Integer,String>marks=new HashMap<>();

        System.out.println("Enter how many students to enter:");
        number=sc.nextInt();

        for (int i=0;i<number;i++)
        {
            System.out.println("Enter Student Roll No: ");
            rollno = sc.nextInt();
            System.out.println("Enter Student Marks: ");
            sc.nextLine();
            sname = sc.nextLine();
            marks.put(rollno,sname);
        }
//        marks.put(rollno,sname);
        System.out.println(marks);

        int getStudent;
        System.out.println("Enter roll no to be retrieved: ");
        getStudent=sc.nextInt();

        System.out.println("Name of Roll No " + getStudent + " is " + marks.get(getStudent));



    }


}
