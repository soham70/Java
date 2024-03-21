
//Parent classs
class Lion{
    void sound()
    {
        System.out.println("Some Sound");
    }
}

class TIger extends  Lion{

    @Override
    void sound()
    {
        System.out.println("Roar....");
    }
}

class Horse extends Lion{

    @Override
    void sound()
    {
        System.out.println("Hurr...");
    }
}

public class Polymorphism_MethodOverriding {

    public static void main(String[] args)
    {
        Lion obj = new TIger();
        obj.sound();

        Lion obj1=new Horse();
        obj1.sound();
    }
}
