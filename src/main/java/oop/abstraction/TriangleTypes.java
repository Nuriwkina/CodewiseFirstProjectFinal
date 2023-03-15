package oop.abstraction;

public abstract class TriangleTypes  extends Shape{

 public abstract void printAngele();


 public void printInfo(){
     System.out.println("printing from triangle types");
 }
 public static void  printStaticInfo(){
     System.out.println("this is static method");
 }

 static String shape = "triangle";
 int numberOfAngeles = 3;
    }




