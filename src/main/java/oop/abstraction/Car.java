package oop.abstraction;

public interface Car {

    /*
    Interface---> is abstract type, that is used to describe the behavior
    that classes must implement
     */

    public abstract void drive();

    public abstract void stop();

    public abstract void accelerate(int speed);

    public abstract void heat(double temp);

    //default method which can have body (implementation)
   default void putOnSeatBelt(){
       System.out.println("the car's default method");

    }











}
