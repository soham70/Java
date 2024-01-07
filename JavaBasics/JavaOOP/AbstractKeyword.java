package JavaOOP;

abstract class Car{
    public abstract void drive();

    public void playMusic()
    {
        System.out.println("Playing Music..");        
    }

}

class WagonR extends Car{

    public void drive()
    {
        System.out.println("Driving WagonR...");
    }
} 

public class AbstractKeyword {
    
   public static void main(String[] args)
   {
        Car obj =new WagonR();
        obj.playMusic();
        obj.drive();

}

}
