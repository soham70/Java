//Parent class
class Animall{

    void eat()
    {
        System.out.println("Animal is eating...");
    }

}

class Mammal extends  Animall{
    void giveBirth()
    {
        System.out.println("Mamal gives birth...");
    }
}

class Dogg extends  Mammal{
    void bark()
    {
        System.out.println("Dog is barking...");
    }
}

public class Multilevel_Inheritance {

    public static void main(String[] args)
    {
        Dogg dg= new Dogg();
        dg.eat();
        dg.bark();
        dg.giveBirth();

    }


}
