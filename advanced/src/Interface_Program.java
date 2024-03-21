//implementing shape interface

interface Shape2{

    double areaCircle();

    void display();

}

class Circlw1 implements Shape2{

    double radius;

    public Circlw1(double rad)
    {
        this.radius=rad;
    }


    @Override
    public double areaCircle() {
        return radius*radius;
    }

    @Override
    public void display() {
        System.out.println("This is a Method");
    }
}


public class Interface_Program {
    public static void  main(String[] args)
    {
        Circlw1 cone =new Circlw1(5);

        System.out.println("Area of a Circle: " + cone.areaCircle());
        cone.display();
    }
}
