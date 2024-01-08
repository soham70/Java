package JavaOOP;

class OuterClass {
    int x = 10;
    // private class InnerClass{
    // int y=20;
    // }

    static class InnerClass {
        int y = 20;
    }

}

public class InnerClassTypes {
    public static void main(String[] args)
    {
        OuterClass outer=new OuterClass();
        // //generates error as we try to access private class
        // OuterClass.InnerClass inner=outer.new InnerClass();

        // An inner class can also be static, which means that you can access
        // it without creating an object of the outer class
        
        OuterClass.InnerClass inner= new OuterClass.InnerClass();

        System.out.println(inner.y);

    }
}
