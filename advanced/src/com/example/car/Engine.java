package com.example.car;

public class Engine {

     int horsePower;

    public Engine(int horsePower)
    {
        this.horsePower=horsePower;
    }

    public void Start()
    {
        System.out.println("Engine Horsepower: " + horsePower);
    }

}
