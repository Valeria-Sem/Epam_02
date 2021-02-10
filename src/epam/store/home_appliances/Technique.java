package epam.store.home_appliances;

import java.util.Comparator;

public class Technique {
    private final double costRyb;

    public Technique(double costRyb) {
        this.costRyb = costRyb;
    }

    public double getCostRyb() {
        return costRyb;
    }


    @Override
    public String toString() {
        return "Technique{" +
                "costRyb=" + costRyb +
                '}';
    }


}
