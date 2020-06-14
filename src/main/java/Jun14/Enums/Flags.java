package Jun14.Enums;

// All capital letters
// like boolean, Flags says if its Estonia or not, if its finland or not....
public enum Flags {
    ESTONIA(false, "Blue"),
    FINLAND(false, "Blue and White"),
    RUSSIA(false, "Red"),
    SWEDEN(false, "Lighter Red"),
    IRAN(false, "Green white red"),
    USA(true,"Blue stars");

    private String color;
    private boolean hasStar;

    Flags(boolean hasStar, String color) {
        this.color = color;
        this.hasStar = hasStar;
    }

    boolean getHasStar() {
        return hasStar;
    }
    String getColor() {
        return color;
    }

}
