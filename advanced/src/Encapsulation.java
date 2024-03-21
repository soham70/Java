public class Encapsulation {

    String Name;

    int Age;

    public Encapsulation(String nm,int ag)
    {
        this.Name=nm;
        this.Age=ag;
    }

    //getter method for name
    public String getName() {
        return Name;
    }

    //setter method for name
    public void setName(String name) {
        Name = name;
    }

    //getter method for age
    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        if(age>0)
        {
            Age = age;
        }else{
            System.out.println("Invalid Age");
        }
    }

    public void display()
    {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
    }

    public static void main(String[] args)
    {
        Encapsulation enp=new Encapsulation("John Doe",22);
        enp.display();
        enp.setName("MAry Alice");
        enp.setAge(30);
        enp.display();
    }

}
