// Defining a class named "Rectangle"
class Rectangle {
    // Instance variables
    int width;
    int height;

    // Constructor to initialize the width and height
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate the area of the rectangle
    public int calculateArea() {
        return width * height;
    }

    // Method to calculate the perimeter of the rectangle
    public int calculatePerimeter() {
        return 2 * (width + height);
    }
}

public class ClassExample {
    public static void main(String[] args) {
        // Creating an object of the Rectangle class
        Rectangle rectangle = new Rectangle(5, 10);

        // Calling methods on the object to perform actions
        int area = rectangle.calculateArea();
        int perimeter = rectangle.calculatePerimeter();

        // Displaying the results
        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }
}
