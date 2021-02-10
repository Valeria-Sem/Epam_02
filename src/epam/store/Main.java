package epam.store;

import epam.store.data.FileDB;
import epam.store.data.TechniqueFactory;
import epam.store.data.Utils;
import epam.store.home_appliances.Technique;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Technique> products = TechniqueFactory.getTechnique(FileDB.getItems());

        System.out.println(Utils.findTheCheapestProduct(products));
        System.out.println(Utils.findProduct(products, "Iron"));
    }
}
