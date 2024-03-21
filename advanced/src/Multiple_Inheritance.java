//Java does not support multiple class inheritance
// instead it supports multiple interface inheritance

interface Walkable
{
    void walk();
}

interface Swimable
{
    void swim();
}

class Amphibian implements Walkable,Swimable{
    @Override
    public void walk()
    {
        System.out.println("Amphibian is walking...");
    }

    @Override
    public void swim()
    {
        System.out.println("Amphibian is Swimming...");
    }
}

public class Multiple_Inheritance {

    public static void main(String[] args)
    {
        Amphibian amp = new Amphibian();
        amp.walk();;
        amp.swim();

    }


}
