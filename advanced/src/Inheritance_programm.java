
//Super Class or Parent Class
 class Animal{
    void eat()
    {
        System.out.println("Animal eats food");
    }
    void sleep()
    {
        System.out.println("Animal is Sleeping");
    }
};

//Child class or SubClass
class Dog extends Animal{
    void bark()
    {
        System.out.println("Dog is Barking...");
    }
}


public class Inheritance_programm {


    public static void main(String[] args)
    {
        Animal anm = new Animal();
        anm.eat();
        Dog dg=new Dog();
        dg.eat();
        dg.bark();
        dg.sleep();


    }

}
