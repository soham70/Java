

//creating an interface

interface Flyer{
    void fly();
}

class Bird{
    public void  chirp()
    {
        System.out.println("Bird is Chirping...");
    }
}

class Sparrow extends Bird implements Flyer{
    @Override
    public void fly()
    {
        System.out.println("Sparrow is Flying...");
    }


}

public class Hybrid_Inheritance {


    public static void main(String[] args){
        Sparrow myObj =new Sparrow();
        myObj.fly();
        myObj.chirp();
    }

}
