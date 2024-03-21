
abstract class Shaped {

    //abstract method (no implementation
    public abstract void draw();

    //concrete method

    public void displayArea() {
        System.out.println("Area: " + calcArea());
    }

    //abstract method

    protected abstract double calcArea();
}

class CircleClass extends Shaped{

    private double radius;

    public CircleClass(double rad)
    {
        this.radius=rad;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle...");
    }

    @Override
    protected double calcArea() {
        return Math.PI * radius * radius;
    }
}

class Rect extends Shaped{
    private double length;

    private double breadth;

    public Rect(double l,double b)
    {
        this.length=l;
        this.breadth=b;
    }

    @Override
    public void draw()
    {
        System.out.println("Rectangle is drawn...");
    }


    @Override
    protected double calcArea()
    {
        return length*breadth;
    }
}

public class Abstraction {

    public static void main(String[] args)
    {
        CircleClass cc =new CircleClass(5);

        Rect rc =new Rect(5,10);

        //Using abstract class reference

        Shaped sh =cc;
        Shaped  sh2= rc;

        //calling abstract methods
        sh.draw();
        sh.calcArea();
        sh.displayArea();

        sh2.draw();
        sh2.displayArea();

    }


}
