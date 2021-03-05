package epam.task_2.store.data;

import epam.task_2.store.entity.Appliance;

import java.util.ArrayList;

public class Utils  {

    public static ArrayList<Appliance> findTheCheapestProduct(ArrayList<Appliance> technique){
        ArrayList<Appliance> cheapestProduct = new ArrayList<>();
        Double min = null;

        for (Appliance item : technique) {
            double currentCost = item.getCostRyb();
            if (min == null) {
                min = currentCost;
            }
            if (currentCost < min) {
                min = currentCost;
                cheapestProduct = new ArrayList<>();
                cheapestProduct.add(item);
            } else if (currentCost == min) {
                cheapestProduct.add(item);
            }
        }

        return cheapestProduct;
    }

    public static ArrayList<Appliance> findProduct(ArrayList<Appliance> tec, String name){
        ArrayList<Appliance> products = new ArrayList<>();

        for(Appliance item : tec){
            if(item.toString().contains(name)){
                products.add(item);
            }
        }

        return products;
    }
}
