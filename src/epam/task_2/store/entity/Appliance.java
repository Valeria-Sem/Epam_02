package epam.task_2.store.entity;

import java.util.Objects;

public class Appliance {
    private double costRyb;

    public Appliance(){

    }

    public Appliance(double costRyb) {
        this.costRyb = costRyb;
    }

    public double getCostRyb() {
        return costRyb;
    }

    public void setCostRyb(double costRyb) {
        this.costRyb = costRyb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return Double.compare(appliance.costRyb, costRyb) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(costRyb);
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "costRyb=" + costRyb +
                '}';
    }


}
