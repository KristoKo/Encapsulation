package collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Olivier");
        names.add("Andreas");
        names.add("Minez");
        names.add("Kristo");
        names.add("Tiina");

        System.out.println(names.get(0) + " is friend with " + names.get(1));

        //names.toArray();
        //enhanced loop
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}
