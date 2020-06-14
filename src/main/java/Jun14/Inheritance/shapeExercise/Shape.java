package Jun14.Inheritance.shapeExercise;

        /*1. Create a Shape class.
        a) Add fields, create constructor, getters and setters.
        b) Create classes Rectangle and Circle. Both of them should inherit class Shape.
        Which fields and methods are common?

        We have common fields which are numberOfSides and color;
        uncommon fields are side1Length, side2Length and Radius

        */

public class Shape {
    private int numberOfSides;
    private String color;

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int sides) {
        this.numberOfSides = sides;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
