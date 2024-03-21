
//creating interface
interface Shape{

    double calcArea();
    double calcPerimeter();

}


//class Circle implementing Shape interface
class Circle implements Shape{

private int radius;

public Circle( int rad)
{
    this.radius=rad;
}

@Override
    public double calcArea()
{
    return Math.PI * radius * radius;
}

@Override
    public double calcPerimeter()
{
    return 2*Math.PI*radius;
}

}

//Class Rectangle implementing Shape interface
class Rectangle implements Shape{
    private int length;
    private int breadth;

    public Rectangle(int len,int brd)
    {
        this.length=len;
        this.breadth=brd;
    }

    @Override
    public double calcArea()
    {
        return length*breadth;
    }

    @Override
    public double calcPerimeter() {
        return 2*(length+breadth);
    }


}


//Implementing Calculate to demonstrate Dependency Injection
class Calculate{

    private final Shape shape;

    public Calculate( Shape shape)
    {
    this.shape=shape;
    }

    public void displayResults()
    {
        System.out.println("Perimeter: " + shape.calcPerimeter());
        System.out.println("Area: " + shape.calcArea());
    }

}

public class Assignment2 {

public static  void main(String[] args)
{

    // Creating a Circle object and passing it to Calculate class
    Circle circle =new Circle(5);
    Calculate calculate = new Calculate(circle);
    System.out.println("For Circle: ");
    calculate.displayResults();

    // Creating a Rectangle object and passing it to Calculate class
    Rectangle rect = new Rectangle(10,20);
    Calculate recCalc = new Calculate( rect);
    System.out.println("For Rectangle");
    recCalc.displayResults();

}


}
