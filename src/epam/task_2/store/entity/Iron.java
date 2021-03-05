package epam.task_2.store.entity;

import java.util.Objects;

public class Iron extends Appliance {
    private String model;
    private String soleMaterial;
    private int powerVt;
    private String color;

    public Iron(){

    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Iron iron = (Iron) o;
        return powerVt == iron.powerVt && Objects.equals(model, iron.model)
                && Objects.equals(soleMaterial, iron.soleMaterial) && Objects.equals(color, iron.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model, soleMaterial, powerVt, color);
    }

    @Override
    public String toString() {
        return "Iron {" +
                "model='" + model + '\'' +
                ", soleMaterial='" + soleMaterial + '\'' +
                ", powerVt=" + powerVt +
                ", color='" + color + '\'' +
                ", costRub='" + getCostRyb() + '\'' +
                " } ";
    }
}
