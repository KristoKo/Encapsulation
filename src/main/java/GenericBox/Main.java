package GenericBox;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4, "ABC-123");
        
        GenericBox<Vehicle> genericBoxer = new GenericBox<>(vehicle);
    }
}
