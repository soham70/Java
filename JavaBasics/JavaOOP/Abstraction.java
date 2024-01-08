package JavaOOP;

/*
The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from). 

 */


abstract class AbstractClass {
    public abstract void func();

    public void func1()
    {
        System.out.println("Methoid is not abstract");
    }
}

class Subclass extends AbstractClass{
    public void func()
    {
        System.out.println("Abstract Method Called");
    }
}

class Abstraction{
    public static void main(String[] args)
    {
        Subclass sc =new Subclass();
        sc.func();
        sc.func1();
    }

}