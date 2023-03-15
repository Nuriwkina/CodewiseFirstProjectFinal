package homeAssignmentNew;


public class Rectangle {


    double length;
    double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return (2 * (length + width));
    }

    public void setLength(double newLength) {
        this.length = newLength;

    }

    public void setWidth(double newWidth) {
        this.width = newWidth;

    }

    public void displayRectangleInfo() {
        System.out.println("The length of rectangle is: " + length + "\nThe width of rectangle is: " +
                width + "\nThe area of rectangle is: " + getArea() + "\nPerimeter of rectangle is: " +
                getPerimeter() + "\n");
    }
}