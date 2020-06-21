package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {

        Map<String, String> countries = new HashMap<>();

        countries.put("Iran", "Tehran");
        countries.put("Finland", "Helsinki");
        countries.put("Estonia", "Tallinn");

        System.out.println(countries.get("Finland"));

        for (Map.Entry<String, String> dict : countries.entrySet()) {
            System.out.println("Country " + dict.getKey());
            System.out.println("Capital city " + dict.getValue());
        }


/*        Set<String> countries = new HashSet<>();
        countries.add("Estonia");
        countries.add("Finland");
        countries.add("USA");
        countries.add("Germany");

        System.out.println(countries.size());  //12 times entries
        for (String country : countries) {
            System.out.println(country);
        }

        countries.remove("Finland"); //once deletion

        System.out.println(countries.size()); //12 times entries +1 deletion
        for (String country : countries) {
            System.out.println(country);
        }
*/


    }
}
