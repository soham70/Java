package JavaOOP;

/*
In Java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group classes that belong together, which
makes your code more readable and maintainable.
To access the inner class, create an object of the outer 
class, and then create an object of the inner class
 */

class Outer{
    int x=10;

    class Inner{
        int y=20;
    }
}

public class ClassInner {
    public static void main(String[] args)
    {
        Outer outer=new Outer();
        System.out.println("Outer x value: "+outer.x);

        Outer.Inner inner =outer.new Inner();

        System.out.println("Inner class y value:"+inner.y);
        
    }
}
