public class Polymorphism_MethodOverloading {

    static int add(int a,int b)
    {
        return a+b;
    }

    static int add(int a,int b,int c)
    {
        return a+b+c;
    }

    static double add( double a,double b)
    {
        return a+b;
    }

    public static void main(String[] args)
    {
        int sum1 =add(10,20);
        int sum2=add(5,10,20);
        double sum3=add(10.20,20.30);

        //display results

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

    }

}
