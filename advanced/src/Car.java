public class Car {
    int n=10;

    String name="Maruti Brezza";
    String model="2024";

    String fname="Soham";
    String lname="Sheth";


    public static void main(String[] args)
    {
        Car car =new Car();

        System.out.println(car.name);
        System.out.println(car.model);

        //Modifying attributes
        car.model="Hyundai Creta";

        System.out.println(car.model);

        System.out.println("Name: " + car.fname +" " + car.lname);


    }


}

