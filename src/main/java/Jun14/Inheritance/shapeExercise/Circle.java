package Jun14.Inheritance.shapeExercise;

public class Circle extends Shape {

    private String Radius;

    public String getRadius() {
        return Radius;
    }

    public void setRadius(String radius) {
        Radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "sides=" + getNumberOfSides() +
                ", color=" + getColor() +
                ", radius=" + getRadius() +
                "}";
    }

}
