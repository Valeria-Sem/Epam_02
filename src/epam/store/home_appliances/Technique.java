package epam.store.home_appliances;

public abstract class Technique {
    private double costRyb;

    public Technique(double costRyb) {
        this.costRyb = costRyb;
    }

    public double getCostRyb() {
        return costRyb;
    }

    public void setCostRyb(double costRyb) {
        this.costRyb = costRyb;
    }

    @Override
    public String toString() {
        return "Technique{" +
                "costRyb=" + costRyb +
                '}';
    }
}
