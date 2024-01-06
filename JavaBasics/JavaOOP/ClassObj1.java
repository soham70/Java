package JavaOOP;

public class ClassObj1 {
    int x=10;
    //final keyword
        final int y=20;

    public static void main(String[] args)
    {
        ClassObj1 obj=new ClassObj1();
        System.out.println(obj.x);
        obj.x=25;
        System.out.println(obj.x); //value of x chabges
        System.out.println(obj.y);
        // obj.y=30; //causes error
        // System.out.println(obj.y);



    }
}
