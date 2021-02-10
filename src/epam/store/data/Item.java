package epam.store.data;

import java.util.HashMap;

public class Item {
    public String name;
    public HashMap<String, Object> descriptions;

    public Item(String name, HashMap<String, Object> descriptions) {
        this.name = name;
        this.descriptions = descriptions;
    }
}
