
//creating an interface
interface  Sports{
    void play();
}

class Cricket implements Sports{
    @Override
    public void play()
    {
        System.out.println("Playing Cricket...");
    }
}

class Football implements Sports{
    @Override
    public void play()
    {
        System.out.println("Playing Football...");
    }
}



public class Polymorphism_UsingInterfaces {

    public static void main(String [] RGS)
    {
        Cricket obj =new Cricket();
        obj.play();

        Football ball = new Football();
        ball.play();
    }

}
