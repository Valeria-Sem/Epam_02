package epam.task_2.store.data;

import epam.task_2.store.entity.*;

import java.util.ArrayList;

public class ApplianceFactory {

    public static ArrayList<Appliance> getTechnique(ArrayList<Item> items){
        ArrayList<Appliance> techniques = new ArrayList<>();

        for (Item item: items) {


            switch (item.name){
                case "Iron":
                    String model = (String) item.descriptions.get("MODEL");
                    String soleMaterial = (String) item.descriptions.get("SOLE_MATERIAL");
                    int powerVt = Integer.parseInt((String) item.descriptions.get("POWER_VT"));
                    String color = (String) item.descriptions.get("COLOR");
                    double costRyb = Double.parseDouble((String)item.descriptions.get("COST_RYB"));

                    techniques.add(new Iron(costRyb, model, soleMaterial, powerVt, color));
                    break;

                case "Oven":
                    int oPowerConsumption = Integer.parseInt((String) item.descriptions.get("POWER_CONSUMPTION"));
                    double oWeight = Double.parseDouble((String) item.descriptions.get("WEIGHT"));
                    int capacity = Integer.parseInt((String)item.descriptions.get("CAPACITY"));
                    int depth = Integer.parseInt((String) item.descriptions.get("DEPTH"));
                    double oHeight = Double.parseDouble((String) item.descriptions.get("HEIGHT"));
                    double oWidth = Double.parseDouble((String) item.descriptions.get("WIDTH"));
                    double oCostRyb = Double.parseDouble((String) item.descriptions.get("COST_RYB"));

                    techniques.add(new Oven(oCostRyb, oPowerConsumption, oWeight, capacity,
                            depth, oHeight, oWidth));
                    break;

                case "Laptop":
                    double batteryCapacity = Double.parseDouble((String) item.descriptions.get("BATTERY_CAPACITY"));
                    String os = (String) item.descriptions.get("OS");
                    int memoryRom = Integer.parseInt((String) item.descriptions.get("MEMORY_ROM"));
                    int systemMemory = Integer.parseInt((String) item.descriptions.get("SYSTEM_MEMORY"));
                    double cpu = Double.parseDouble((String) item.descriptions.get("CPU"));
                    int displayInches = Integer.parseInt((String) item.descriptions.get("DISPLAY_INCHES"));
                    double lCostRyb = Double.parseDouble((String) item.descriptions.get("COST_RYB"));

                    techniques.add(new Laptop(lCostRyb, batteryCapacity, os, memoryRom,
                            systemMemory, cpu, displayInches));
                    break;

                case "Refrigerator":
                    int rPowerConsumption = Integer.parseInt((String) item.descriptions.get("POWER_CONSUMPTION"));
                    int rWeight = Integer.parseInt((String) item.descriptions.get("WEIGHT"));
                    int freezerCapacity = Integer.parseInt((String) item.descriptions.get("FREEZER_CAPACITY"));
                    double overallCapacity = Double.parseDouble((String) item.descriptions.get("OVERALL_CAPACITY"));
                    int rHeight = Integer.parseInt((String) item.descriptions.get("HEIGHT"));
                    int rWidth = Integer.parseInt((String) item.descriptions.get("WIDTH"));
                    double rCostRyb = Double.parseDouble((String) item.descriptions.get("COST_RYB"));

                    techniques.add(new Refrigerator(rCostRyb, rPowerConsumption, rWeight, freezerCapacity,
                            overallCapacity, rHeight, rWidth));
                    break;

                case "Speakers":
                    int sPowerConsumption = Integer.parseInt((String) item.descriptions.get("POWER_CONSUMPTION"));
                    int numberOfSpeakers = Integer.parseInt((String) item.descriptions.get("NUMBER_OF_SPEAKERS"));
                    String frequencyRange = (String) item.descriptions.get("FREQUENCY_RANGE");
                    int cordLength = Integer.parseInt((String) item.descriptions.get("CORD_LENGTH"));
                    double sCostRyb = Double.parseDouble((String) item.descriptions.get("COST_RYB"));

                    techniques.add(new Speakers(sCostRyb, sPowerConsumption, numberOfSpeakers,
                            frequencyRange, cordLength));
                    break;

                case "TabletPC":
                    int tBatteryCapacity = Integer.parseInt((String) item.descriptions.get("BATTERY_CAPACITY"));
                    int tDisplayInches = Integer.parseInt((String) item.descriptions.get("DISPLAY_INCHES"));
                    int tMemoryRom = Integer.parseInt((String) item.descriptions.get("MEMORY_ROM"));
                    int flashMemoryCapacity = Integer.parseInt((String) item.descriptions.get("FLASH_MEMORY_CAPACITY"));
                    String tColor = (String) item.descriptions.get("COLOR");
                    double tCostRyb = Double.parseDouble((String) item.descriptions.get("COST_RYB"));

                    techniques.add(new TabletPC(tCostRyb, tBatteryCapacity, tDisplayInches, tMemoryRom,
                            flashMemoryCapacity, tColor));
                    break;

                case "VacuumCleaner":
                    int vcPowerConsumption = Integer.parseInt((String) item.descriptions.get("POWER_CONSUMPTION"));
                    String filterType = (String) item.descriptions.get("FILTER_TYPE");
                    String bagType = (String) item.descriptions.get("BAG_TYPE");
                    String wandType = (String) item.descriptions.get("WAND_TYPE");
                    int motorSpeedRegulation = Integer.parseInt((String) item.descriptions.get("MOTOR_SPEED_REGULATION"));
                    int cleaningWidth = Integer.parseInt((String) item.descriptions.get("CLEANING_WIDTH"));
                    double vCostRyb = Double.parseDouble((String) item.descriptions.get("COST_RYB"));

                    techniques.add(new VacuumCleaner(vCostRyb, vcPowerConsumption, filterType, bagType,
                            wandType, motorSpeedRegulation,cleaningWidth));
                    break;

                default:
                    throw new IllegalArgumentException("Wrong item name");
            }
        }

        return techniques;
    }
}
