package JavaOOP;

interface FirstInterface{
    public void myMethod();
}

interface SecondInterface{
    public void secMethod();
}

class Demo implements FirstInterface,SecondInterface{
    @Override
    public void myMethod() {
        // TODO Auto-generated method stub
        System.out.println("First Interface Implementd");
    }

    public void secMethod()
    {
        System.out.println("Second Interface Implemented");
    }
}

public class MultipleInterfaces {
    public static void main(String[] args)
    {Demo dm= new Demo();
    dm.myMethod();
    dm.secMethod();
}}
