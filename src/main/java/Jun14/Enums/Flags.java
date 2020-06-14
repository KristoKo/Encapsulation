package Jun14.Enums;

// All capital letters
// like boolean, Flags says if its Estonia or not, if its finland or not....
public enum Flags {
    ESTONIA("Blue"),
    FINLAND("Blue and White"),
    RUSSIA("Red"),
    SWEDEN("Lighter Red"),
    IRAN("Green white red"),
    USA("Blue stars");

    String color;

    Flags(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

}
