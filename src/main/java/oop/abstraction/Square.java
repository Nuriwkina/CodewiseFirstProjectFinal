package oop.abstraction;

public class Square extends Shape {

   String name = "square";
   int numberOfCorners = 4;

    @Override
    public int getArea(int length, int width) {
        return length * width;
    }

    @Override
    public int getPerimeter(int length, int width) {
        return (length + width) * 2;
    }

    @Override
    public void printAllSimilarShapes() {

    }
}
