//Parent/SuperClass
class Shape{
    void draw()
    {
        System.out.println("Draw a Shape");
    }
}

class Circle extends Shape{
    void drawCircle(){
        System.out.println("Draw a Circle");
    }
}

class Square extends Shape{
    void drawSquare()
    {
        System.out.println("Draw a Square");
    }
}



public class Hierarchical_Inheritance {

    public static void main(String[] args)
    {
        //Initialising parent class
//        CircleClass cr= new CircleClass();
//        cr.drawCircle(); //own child class method
//        cr.draw();


        //INitialising Parent class
        Square sq = new Square();
        sq.drawSquare(); //own child class method
        sq.draw();
    }

}
