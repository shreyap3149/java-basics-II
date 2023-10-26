package src;

abstract class Vehicle{
    private String make;
    private String model;
    private int wheels;

    private int year;

    public Vehicle(){

    }

    public Vehicle(String make, String model, int wheels, int year){
        this.make = make;
        this.model = model;
        this.wheels = wheels;
        this.year = year;
    }
}
