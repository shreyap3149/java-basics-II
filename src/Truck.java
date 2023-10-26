package src;

public class Truck extends Vehicle {

    private int loadCap;

    public Truck(String make, String model, int year, int loadCap){
        super(make,model, year, 5);
        this.loadCap = loadCap;
    }


}
