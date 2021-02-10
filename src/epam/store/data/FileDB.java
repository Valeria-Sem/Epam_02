package epam.store.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FileDB {
    public static ArrayList<Item> getItems() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("appliances_db.txt"));
        ArrayList<Item> items = new ArrayList<>();

        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            line = line.replaceAll("\\s+","");

            String[] arg = line.split(":");
            if(arg.length == 2){
                String techniqueName = arg[0].replaceAll("\\s+","");
                String description = arg[1];
                String[] descriptions = description.split(",");
                HashMap<String, Object> values = new HashMap<String, Object>();
                for(String key : descriptions){
                    String[] inputDescriptions = key.split("=");
                    if (inputDescriptions.length == 2) {
                        values.put(String.valueOf(inputDescriptions[0]), inputDescriptions[1]);
                    }
                }
                items.add(new Item(techniqueName, values));
            }
        }

        return items;
    }
}
