package array;

public class ArraysPractice {
    public static void main(String[] args) {
        /*
        create array of Strings - groceryList, with length of 5 assign values to each element
        using for loop, print all elements
         */


        int numberOfGroceries = 5;
        String[] groceriesList = new String[numberOfGroceries];
        groceriesList[0] = "avocado";
        groceriesList[0] = "tomato";
        groceriesList[0] = "apple";
        groceriesList[0] = "milk";
        groceriesList[0] = "egg";


        for (int i = 0; i < groceriesList.length; i++) {
            System.out.println(i + 1 + ") " + groceriesList[i]);
        }
        //=========================

        char[] array = new char[]{'c', 'o', 'd', 'i', 'n', 'g', 'i', 's', 'g', 'r', 'e', 'a', 't'};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        //========================
        String[] colors = new String[]{"blue", "yellow", "orange", "green", "white", "black", "red"};

        for (int i = 0; i < colors.length; i++) {

            if (colors[i].equals("yellow") || colors[i].equals("green")) {
                continue;
            }
            System.out.println(colors[i]);
        }
        //=========================

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 3 || numbers[i] == 8){

            }
            System.out.println(numbers[i]);
        }
        //===========================

        double [] doubles = new double[]{1.99, 2.99, 3.99, 7.8, 6.4, 5.5, 7.8, 7.4, 10};
        String values = "";
        for (int i = 0; i < doubles.length; i++){
           if (i >= 6 && i <= 8) {
               continue;
           }
            System.out.print(doubles[i] + ", ");

        }
    }}