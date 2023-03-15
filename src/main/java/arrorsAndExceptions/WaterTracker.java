package arrorsAndExceptions;

public class WaterTracker {

    final int minAmountOfWaterADay = 2000;
    int amountOfConsumedWater = 0;

    final int maxAmountOfWaterADay = 4000;


    /*
    add logic that checks if minAmount of water was already consumed, if yes
    Wohoo, good job! you drank the min amount of water!

    check if amount is not less than 1, if less than 1  ==> IncorrectAmountOfWater
    you must drink at least 1 ml per time

    check if amountOfWater do not exceed maxAmount of Water,
    if exceeds, throw Exception


     */
    public void trackWater(int amount) throws IncorrectAmountOfWater {

        if (amount < 1) {
            throw new IncorrectAmountOfWater("You can't not drink less than 1ml");
        }
        if(amount>=maxAmountOfWaterADay){
            //throw new MaxAmountOfWaterException("Don't drink too much! Your tummy will blow up! ");
        }

        System.out.println("Consumed " + amount + " ml of water. Good job");
        amountOfConsumedWater += amount;


        if (amountOfConsumedWater >= minAmountOfWaterADay){
            System.out.println("Wohoo! Good Job, you drunk the min amount of water! ");
        }

        getLeftAmount();
    }


    public int getLeftAmount() {

        if (minAmountOfWaterADay - amountOfConsumedWater > 0) {
            System.out.println(minAmountOfWaterADay - amountOfConsumedWater + " ml of water left to drink today");
            return minAmountOfWaterADay - amountOfConsumedWater;
        }else{
            System.out.println("You consumed enough water, Go drink a coke and eat! ");
            return 0;
        }
    }
    public static void main(String[] args) throws IncorrectAmountOfWater {
        WaterTracker tracker = new WaterTracker();
        tracker.trackWater(200);
        tracker.trackWater(1);
        //tracker.trackWater(-20);
        //tracker.trackWater(4500);
        tracker.trackWater(3500);
        tracker.trackWater(3200);


    }






}



