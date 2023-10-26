package src;

import java.util.ArrayList;

public class Table implements Billable {

    private Integer width;
    private Integer length;
    private ArrayList<Leg> legs;

    public Table(Integer numLegs, Integer width, Integer length) {
        this.width =width;
        this.length = length;
        for(int i = 0; i < numLegs; i++) {
            legs.add(new Leg(25));
        }
    }

    public Table(Integer numLegs){
        this(numLegs, 20, 10);
    }

    public Float getPrice(){
        float areaInches = length * width;
        return areaInches *= 1.0f;

    }


}
