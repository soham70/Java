public class method_overloading {
    static void addition(int x,int y)
    {
        System.out.println(x+y);
    }

    static void addition(double x,double y)
    {
        System.out.println(x+y);
    }

    public static void main(String[] args)
    {
        addition(10,12);
        addition(10.2,12.8);
        addition(10.123,12.877);
    }
}
