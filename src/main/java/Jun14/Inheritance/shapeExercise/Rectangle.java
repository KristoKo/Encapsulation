package Jun14.Inheritance.shapeExercise;

public class Rectangle extends Shape {

    private int side1Length;
    private int side2Length;

    public int getSide1Length() {
        return side1Length;
    }

    public void setSide1Length(int side1Length) {
        this.side1Length = side1Length;
    }

    public int getSide2Length() {
        return side2Length;
    }

    public void setSide2Length(int side2Length) {
        this.side2Length = side2Length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sides=" + getNumberOfSides() +
                ", color=" + getColor() +
                ", side1Length=" + getSide1Length() +
                ", side2Length=" + getSide2Length() +
                "}";
    }
}
