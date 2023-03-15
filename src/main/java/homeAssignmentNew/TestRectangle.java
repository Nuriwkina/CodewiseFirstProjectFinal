package homeAssignmentNew;


public class TestRectangle {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(8.5,5.6);
        rectangle.displayRectangleInfo();

        double newLength = 17.5;
        double newWidth = 11.7;
        rectangle.setLength(8);
        rectangle.setWidth(4);
        rectangle.displayRectangleInfo();
    }
}




