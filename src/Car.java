package src;

public class Car extends Vehicle{

    private  int numDoors;

    public Car(String make, String model, int numDoors, int year){
        super(make, model, 4, year);
        this.numDoors = numDoors;

    }
}
