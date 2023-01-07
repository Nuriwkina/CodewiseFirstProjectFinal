package arrayList;

import esensRecapClass.Monitor;

import java.util.ArrayList;

public class RecapArrayList {
    public static void main(String[] args) {

        ArrayList<Double> salary = new ArrayList<>(); //declare
        salary.add((double)2300.0);
        salary.add(3300.00);
        salary.add(5500.50);
        salary.add(800.20);
        salary.add((double)10000);
        salary.add(4500.50);


        /*
        find the largest salary
         */
        Double largest = 0.0;

        for (int i = 0; i < salary.size(); i++) {
            if (salary.get(i) > largest) {
                largest = salary.get(i);

            }
            System.out.println(largest);

            /*
           find the smallest salary
             */
        }
            Double smallest = salary.get(0);

            for (int s = 0; s < salary.size(); s++) {
                if (salary.get(s) < smallest) {
                    smallest = salary.get(s);

                }
                System.out.println(smallest);
//===============================================================

                ArrayList<Short>orderID = new ArrayList<>();
                orderID.add((short)323);
                orderID.add(Short.valueOf("543"));
                orderID.add(Short.valueOf((short) 909));
                orderID.add((short)121);
                orderID.add((short)343);
                orderID.add((short)234);

                /*
                find the average of all orderIDs and print it
                 */
                short sum = 0;
                int average;
                for (int b = 0; b < orderID.size(); b++){
                  sum += orderID.get(b);
                }
                average = sum / orderID.size();
                System.out.println(average);




            }

    }
}
