package Jun14.Inheritance.shapeExercise;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("blue");
        rectangle.setNumberOfSides(4);
        rectangle.setSide1Length(5);
        rectangle.setSide2Length(10);

        Circle circle = new Circle();

        System.out.print("We have a " + rectangle.toString());
        System.out.println("and a circle" + circle.toString());
    }
}
