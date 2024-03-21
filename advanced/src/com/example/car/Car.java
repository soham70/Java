package com.example.car;

public class Car {

    private String make;
    private  String model;

    public Car(String mk,String mdl)
    {
        this.make=mk;
        this.model=mdl;
    }

    public void display()
    {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);

    }

//    public static void main(String[] args)
//    {
//        Car ccc = new Car()
//    }

}
