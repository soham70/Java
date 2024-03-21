public class Person {

    String name;

    int age;
    public Person()
    {
        name="Java";
        age=10;
    }

    public Person(String n,int a)
    {
        name=n;
        age=a;
    }

    void show()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    public static void main(String[] args)
    {
        Person pr=new Person();
        Person prn=new Person("JavaCode",15);

        pr.show();
        prn.show();
    }
}
