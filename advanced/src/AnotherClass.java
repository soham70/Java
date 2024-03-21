import java.util.ArrayList;

public class AnotherClass extends Myclass{

    public static  void main(String[] args)
    {
//        Myclass obj = new Myclass();
//        System.out.println(obj.publicVar);
//        obj.publicMethod();
//
//        AnotherClass anc=new AnotherClass();
//        anc.protectedMethod(); //accessible in derived class

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);

        numbers.add(10);

        numbers.forEach(num -> System.out.print(num+" "));
    }

}
