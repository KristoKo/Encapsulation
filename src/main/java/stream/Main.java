package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        //usage of stream.of instead of saving data in another array.asList and assigning it to Stream<String>
        // Stream<String> names = Stream.of("Andrew", "Brandon", "Michael");

        //the normal way
        // List<String> namesList = Arrays.asList("Andrew", "Brandon", "Michael");
        // Stream<String> namesListStream = namesList.stream();

        //Collector method
        // List<String> namesListCopy = namesListStream.collect(Collectors.tolist());

        //map examples
        //List<String> namesList2 = Arrays.asList("Andrew", "Brandon", "Michael");
        //List namesLengths = namesList2.stream()
        //      .map(String::length)
        //      .collect(Collectors.toList());

        List<String> namesStream = getStream();

        namesStream.stream()
                .filter(name -> name.equals("name1"))
                .findAny()
                .ifPresent(System.out::println);

    }

    private static List<String> getStream() {
        List<String> names = new ArrayList<>();
        names.add("name1");
        names.add("name2");

        return names;
    }
}
