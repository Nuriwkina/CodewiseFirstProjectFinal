package homeAssignmentNew;

public class Motorcycle {
    String make;
    String model;
    int year;
    boolean isRunning;


    public Motorcycle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;


    }
    public void startEngine(){ this.isRunning = true; }
    public void stopEngine(){ this.isRunning = false; }
    public String getModel() { return this.model; }
    public int  getYear() { return this.year; }
    public boolean isRunning(){
        return  this.isRunning;



    }


}
