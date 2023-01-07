package array2;

public class PracticePrinting2 {
    public static void main(String[] args) {

        String[] numbers = {"12", "45", "56", "234"};
        String[] words = {"sun", "earth", "jupiter", "moon"};

        String[][] twoDimenArr = {numbers, words};


        for (int i = 0; i < twoDimenArr.length; i++) {
            for (int j = 0; j < twoDimenArr[i].length; j++) {
                System.out.println(twoDimenArr[i][j]);
            }
        }
        /*
        print only words, no numbers sun- eards
         */
        for (int i = 0; i < twoDimenArr.length; i++) {
            for (int j = 0; j < twoDimenArr[i].length; j++) {
                System.out.println(twoDimenArr[0][j] + " ");
            }

        }
        /*
        create one dimensional double array and print using for each loop
         */

        double[] prices = {20.40, 3.9, 2.94};
        for (double cost : prices) {
            System.out.println(cost);
        }

            /*
            Create 4 string arrays
            and put them all inside one two dimensional array
            using loop, print all values
            inside for loop create for each loop
             */

        String[] girlNames = {"Haley", "Aurora", "Miley"};
        String[] boyNames = {"Bob", "Tom", "Rick"};
        String[] colors = {"black", "white", "red"};
        String[] seasons = {"summer", "winter", "spring"};

        String[][] twoDimArr = {girlNames, boyNames};
        String[][] twoDimArr2 = {colors, seasons};

        String[][] twoDimArr1 = {girlNames, boyNames, colors, seasons};

        for (int i = 0; i < twoDimArr.length; i++) {
            for (String str : twoDimArr[i]) {
                System.out.println(str + " ");
            }
            System.out.println();
        }
        //======================================

        /*
        Create 4 String one dim arrays
        Create 2 String two dim arrays
        Create 1 String three dim arrays
        print everything using for loop and for each loop
        */

        String[] madrid = {"modric", "ronaldo", "carlos"};
        String[] barcelona = {"messi", "pedro", "pique"};
        String[] psg = {"messi", "mbappe", "neymar"};
        String[] manut = {"sko", "kok", "pop"};

        String[][] total = {madrid, barcelona};
        String[][] total1 = {psg, manut};

        String[][][] total2 = {total, total1};

        for (int i = 0; i < total2.length; i++) {
            for (int k = 0; k < total2[i].length; k++) {
                for (String name : total2[i][k]) {
                    System.out.print(name + " , ");
                }
            }


            String[][][][] fourDimArr = {total2, {total1, total}, {{madrid, psg}, {barcelona, manut}}};
            System.out.println("Below is four dimensional array printed using for each loops");
            for (String[][][] threeDim : fourDimArr) {
                for (String[][] twoDim : threeDim) {
                    for (String[] oneDim : twoDim) {
                        for (String name : oneDim) {
                            System.out.print(name + " - ");
                        }
                    }
                }


                int[] num2 = {10, 20, 30, 40, 50};
                int[] num3 = {100, 200, 300, 400, 500};
                int[] num4 = {1000, 2000, 3000, 4000, 5000};
                int[] num5 = {10000, 20000, 30000, 40000, 50000};
                // create 5 dimen array of int, using for each loop, print everything

                int[][][][][] fiveDimIntArr = {{{{num5, num2}, {num3, num4}}}};

                for (int[][][][] fourDimIntArr : fiveDimIntArr) {
                    for (int[][][] threeDimIntArr : fourDimIntArr) {
                        for (int[][] twoDimIntArr : threeDimIntArr) {
                            for (int[] oneDimIntArr : twoDimIntArr) {
                                for (int a : oneDimIntArr) {
                                    System.out.print(a + " ");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}