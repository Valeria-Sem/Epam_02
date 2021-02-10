package epam.store.data;

import epam.store.home_appliances.Technique;

import java.util.ArrayList;

public class Utils  {

    public static ArrayList<Technique> findTheCheapestProduct(ArrayList<Technique> technique){
        ArrayList<Technique> cheapestProduct = new ArrayList<>();
        Double min = null;

        for (Technique item : technique) {
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

    public static ArrayList<Technique> findProduct(ArrayList<Technique> tec, String name){
        ArrayList<Technique> products = new ArrayList<>();

        for(Technique item : tec){
            if(item.toString().contains(name)){
                products.add(item);
            }
        }

        return products;
    }
}
