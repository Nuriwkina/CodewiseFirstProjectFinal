package classesAndObjects;

public class Animal {

    String type;
    String color;
    String size;
    String name;

    byte age;
    boolean isMammal;

    public void eats(){
        System.out.println(color + " " + size + " " + type + "is eating");

    }

    public void sleeps(){
        System.out.println(color + " " + size + " " + type + "is sleeping");

    }

    public void play() {
        System.out.println(color + " " + size + " " + type + "is playing");

    }

    //return

    public boolean isMammal() {
        return true;
    }


    public String getName(){
        String name = "Bambi";
        return name;
    }

    }









