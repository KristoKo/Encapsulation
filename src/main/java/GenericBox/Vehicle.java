package GenericBox;

public class Vehicle {
    private int numberOfWheels;
    private String plateNumber;

    public Vehicle(int numberOfWheels, String plateNumber) {
        this.numberOfWheels = numberOfWheels;
        this.plateNumber = plateNumber;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
