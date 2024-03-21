
//Base class Vehicle
class Vehicle{

    //defining class attributes
    private String VehicleName;
    private int modelNo;

    //defining Parameterized constructor
    public Vehicle( String vname,int mno)
    {
        this.VehicleName=vname;
        this.modelNo=mno;
    }

    //defining class Methods
    public void VehicleColor()
    {
        System.out.println("Color of the Vehicle is Red");
    }

    public void Own()
    {
        System.out.println("I own " + VehicleName);
    }

    public void display()
    {
        System.out.println("Name of Vehicle is: " + VehicleName);
        System.out.println("Model Number of " + VehicleName + " is " + modelNo);
    }

}

//Inheriting classes
class Car extends Vehicle{

    private int year;

    //Car class constructor
    public Car( String carName,int modelNo,int carYear)
    {
        super(carName,modelNo);
        this.year=carYear;
    }

    //Overriding display method
    @Override
    public void Own()
    {
        System.out.println("I own car produced in year " + year);
    }
}
 public class Assignment1{

    public static void main(String[] args)
     {
         //creating an instance of class Vehicle
         Vehicle vehicle = new Vehicle("Toyota", 97145);

         // calling methods of class Vehicle
         vehicle.VehicleColor();
         vehicle.Own();
         vehicle.display();

         //creating local instance of class Car
         Car car =new Car("Honda",78142,2024);
         car.display();
         car.Own();
     }
}


