class Shape {
    public double calculateArea() {
        return 0.0; // Default implementation for the base class
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class Area{
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 3.0);
        shapes[2] = new Circle(3.5);

        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            System.out.println("Area: " + area);
        }
    }
}
