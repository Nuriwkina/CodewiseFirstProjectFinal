package array;

public class ArrayIntro {
    public static void main(String[] args) {
        //                       0            1       2         3
        String[] animals = {"elephant", "giraffe", "wolf", "lion"};

        String animal1 = animals[0];
        String animal2 = animals[1];
        String animal3 = animals[2];
        String animal4 = animals[3]; //if more than 3, we see outOfBoundsError


        System.out.println(animal1); //elaphant
        System.out.println(animals[2]); //wolf
        System.out.println(animals[10 - 8 + 1]); // lion
        System.out.println(animals[animals.length - 2]);// wolf

        int[] fibonacciNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 13, 21, 34, 55};
        int num1 = fibonacciNumbers[2];//2
        num1 = fibonacciNumbers[5];//8
        int num2 = fibonacciNumbers[0];//1
        int num3 = fibonacciNumbers[fibonacciNumbers.length - 5];//8
        //=====================================================================

        String[] cities = new String[5];
        System.out.println(cities[0]); //null

        cities[0] = "Los Angeles";
        cities[1] = "Paris";
        cities[2] = "Rome";
        cities[3] = "Dubai";
        cities[4] = "Tokyo";

        System.out.println(cities);

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }
        cities[3] = "Kuala-Lumpur";


        String[] countries; //declared/created array of string
        countries = new String[]{"USA", "Argentina", "Italy", "Japan", "", null, "Ukraine"}; //7
        countries[6] = "Singapore";
        countries[5] = "Kazakhstan";


        double [] prices = {1.99, 2.99, 3.99, 20.99, 99.99};
        long [] longArray = {1343, 36677, 235, 545,656,5443};

        boolean [] booleanArray = {true, false, true, false};
        char charArr [] = {'w', 'h','y','c','o','l','d','?',9, (char)-65534};
        char c = 65535;
        System.out.println(c);
        short [] shortArray = {44,33,22,55,77,88};

        int lengthOfNames = 9;
        String [] names = new String[lengthOfNames];

        long lengthOfLastNames = 9;
        String [] lastNames = new String[9];


        for (int i = 0; i < prices.length; i++){
            System.out.println(prices[1]);

        }
        double d = prices[1]; //2.99
        //=======================================================================================

        String [] barries = new String[5];
        String [] fruits = new String[]{"", "", "", "", ""};

        int [] nums = new int[5];
        int [] newNums = new int[]{2,4,5,6,7};

       //=======================================================================================

        String [] cars = {"audi", "toyota", "bmb", "mercedes"};

        String car = cars[0];
        String car1 = cars[1];
        String car2 = cars[2];
        String car3 = cars[3];

        System.out.println(car);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);



    }
}
