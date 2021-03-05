package epam.task_2.store.main;

import epam.task_2.store.entity.Appliance;

import java.util.ArrayList;

public class PrintApplianceInfo {

    public static void print(ArrayList<Appliance> appliances) {
        if (appliances != null) {
            System.out.println(appliances.toString());
        } else {
            System.out.println("There is no such appliance");
        }
    }
}
