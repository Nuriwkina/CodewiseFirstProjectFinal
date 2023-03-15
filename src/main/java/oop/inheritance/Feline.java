package oop.inheritance;

public class Feline extends Animal {

    String specie;
    String habitat;
    int age;

    /*
    this() - call constructor from this class
    super() - call constructor from parent class
     */

    public Feline(int age) {
        super(true, "feline", age);
        System.out.println();
    }
    public Feline(String name){

    }

    public void meow() {

    }

    public void play() {
        System.out.println(specie + "is playing " + " and " + age + "years old");
    }

    public static void main(String[] args) {


        Feline feline = new Feline("Leo");
        feline.eat();
        feline.sleep();
    }
}