package Jun14.Inheritance.shapeExercise;

/*1. Create a Shape class.
        a) Add fields, create constructor, getters and setters.
        b) Create classes Rectangle and Circle. Both of them should inherit class Shape.
        Which fields and methods are common?

        We have common fields which are numberOfSides and color;
        uncommon fields are side1Length, side2Length and Radius

        */

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("blue");
        rectangle.setNumberOfSides(4);
        rectangle.setSide1Length(5);
        rectangle.setSide2Length(10);

        Circle circle = new Circle();

        System.out.println("We have a " + rectangle.toString());
        System.out.println("and a circle" + circle.toString());
    }
}
