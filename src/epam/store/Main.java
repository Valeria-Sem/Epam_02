package epam.store;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
	    String path = "appliances_db.txt";
        Stream<String> stream = Files.lines(Paths.get(path));

        List<String> iron  = stream
                .filter(line -> line.startsWith("Iron"))
                .collect(Collectors.toList());
        iron.forEach(System.out::println);
        stream.close();

        Stream<String> stream2 = Files.lines(Paths.get(path));
        List<String> theCheapestProducts  = stream2
                .filter(line -> line.contains("COST_RYB"))
                .collect(Collectors.toList());
        System.out.println("\n" + Collections.min(theCheapestProducts));
     //   theCheapestProducts.forEach(System.out::println);

        stream2.close();
    }
}
