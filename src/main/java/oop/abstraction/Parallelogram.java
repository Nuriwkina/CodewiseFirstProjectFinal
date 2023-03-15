package oop.abstraction;

public abstract class Parallelogram extends Shape{
    @Override
    public int getArea(int length, int width) {
        return length * width;
    }

    @Override
    public int getPerimeter(int length, int width) {
        return (length * width) * 2;
    }
    public void printAllSimilarShapes(){

    }
}
