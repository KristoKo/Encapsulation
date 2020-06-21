package optional;

import java.util.Optional;

public class optional {
    public static void main(String[] args) {
        Optional<String> nameOfClass = getOptional("Kristo");
        System.out.println(nameOfClass.isPresent());

        if(nameOfClass.isPresent()) {
            System.out.println(nameOfClass.get());
        }
    }

    private static Optional<String> getOptional(String name) {

        if (name.equals("SDA")) {
            return Optional.empty();
        }
        return Optional.of(name);
    }
}
