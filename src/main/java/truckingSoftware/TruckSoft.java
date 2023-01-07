package truckingSoftware;

public class TruckSoft {
    public static void main(String[] args) {
        Driver driver1 = new Driver();
        driver1.name = "Messi";
        driver1.age = 37;
        driver1.isNew = true;

        driver1.printInfo();
        driver1.reportAccident("LA");
        driver1.drive();
        driver1.sendLocation(); //==> "LA"
        driver1.sendTotalLoads();

        //How to catch a value from return type method??
        //I can catch with creating
        // "LA"

        String location = driver1.sendLocation();

        System.out.println(location);

        driver1.sendTotalLoads();
        int loads = driver1.sendTotalLoads();
        System.out.println(loads);

   }




}