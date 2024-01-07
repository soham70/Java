package JavaOOP;

class Bicycle {
    public int gear, speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applybrakes(int dec) {
        speed -= dec;
    }

    public void speedup(int inc) {
        speed += inc;
    }

    public void printinfo() {
        System.out.println("Gears are: " + gear);
        System.out.println("Speed is: " + speed);
    }

}

class Mountainbike extends Bicycle {

    public Mountainbike(int gear, int speed) {
        // always needs to be first statement
        super(gear, speed);
    }

      @Override
    public void printinfo(){
        super.printinfo();
    }
}

public class Inheritance {

    public static void main(String[] args)
    {
        Mountainbike mb=new Mountainbike(3,100);
        mb.printinfo();
        mb.speedup(20);
        mb.printinfo();
        mb.applybrakes(5);
        mb.printinfo();
    }



}
