package oop.abstraction;

public abstract class Shape {

    String name;
    String color;

  //-->  public void printInfo(){
   //     System.out.println("This is " + name + color);
   // }

    public abstract int getArea(int length, int width);
    public abstract int getPerimeter(int length, int width);
    public abstract void printAllSimilarShapes();


}
