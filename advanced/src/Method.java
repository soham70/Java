public class Method {

    static void myMethod()
    {
        System.out.println("Hello Method");
    }

    static void myMethod(int age,String name)
    {
        System.out.println("Name: " + name + " Age: " + age);
    }

    public static  void main(String [] args)
    {
//        myMethod();
        myMethod(22,"Soham");
    }


}
