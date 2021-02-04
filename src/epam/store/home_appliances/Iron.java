package epam.store.home_appliances;

public class Iron extends Technique {
    private String model;
    private String soleMaterial;
    private int powerVt;
    private String color;

    public Iron(double costRyb, String model, String soleMaterial, int powerVt, String color) {
        super(costRyb);
        this.model = model;
        this.soleMaterial = soleMaterial;
        this.powerVt = powerVt;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSoleMaterial() {
        return soleMaterial;
    }

    public void setSoleMaterial(String soleMaterial) {
        this.soleMaterial = soleMaterial;
    }

    public int getPowerVt() {
        return powerVt;
    }

    public void setPowerVt(int powerVt) {
        this.powerVt = powerVt;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Iron{" +
                "model='" + model + '\'' +
                ", soleMaterial='" + soleMaterial + '\'' +
                ", powerVt=" + powerVt +
                ", color='" + color + '\'' +
                "} ";
    }
}
