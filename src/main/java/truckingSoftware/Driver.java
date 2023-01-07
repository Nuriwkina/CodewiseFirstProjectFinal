package truckingSoftware;

public class Driver {

    String name;
    int age;
    boolean isNew;


    public void printInfo() {
        System.out.println("\n Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is driver new: " + isNew);


    }

    public void reportAccident(String location) {
        System.out.println(name + " got it accident in " + location);

    }
    // this method should print out " % is driving"
    public void drive(){
        System.out.println("\n" + name + " is driving: ");

     // Create method called sendLocation
        //This method should send the location back to who is calling.
        // Location is "LA'
    }
    public String sendLocation(){
        // here anything you want
        // huge block of code that can figure out your location

        return "LA";

    }
    // Create a method sendTotalLoads
    //return today's number of loads

    public int sendTotalLoads() {

    int totalLoads = 55;
    return totalLoads;

    }
}