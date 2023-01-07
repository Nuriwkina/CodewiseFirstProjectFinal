package array2;

import java.util.Arrays;

public class PracticePrinting {
    public static void main(String[] args) {

        String[][] strArr = new String[][]{{"plov", "blinhciki", "shashlyk"}, {"tea", "cola", "water"}};
        System.out.println(strArr.length);
        /*
        plov       / tea
        blinchiki  / cola
        shashlyk   / water
         */

        for (int i = 0; i < strArr.length; i++) { //outer loop, will loop through

            for (int k = 0; k < strArr[i].length; k++) { //iner loop
                System.out.println(strArr[i][k]);

            }
        }
        //=================================================

        String[] foods = {"sushi", "ramen", "tom-yam"};
        String[] drink = {"green tea", "black tea", "soda", "mountain dew", "eater"};

        String[][] menu = new String[][]{foods, drink};

        for (int i = 0; i < menu.length; i++) {
            for (int k = 0; k < menu[i].length; k++) {
                System.out.println(menu[i][k]);
            }
        }
//=====================================================================
        String [] birds = {"mockingbird", "sparrow", "parrot", "eagle"};
        String [] insects = {"grasshopper", "spider", "ladybug"};
        String [] mammals = {"cow", "bear", "whale", "elephant", "dog", "human"};


        String[][] animals = new String[][]{birds, insects, mammals, birds, mammals};

        for (int i = 0; i < animals.length; i++){
            for (int k = 0; k < animals[i].length; k++){
                System.out.print(animals[i][k] + " ");
            }
            System.out.println();
        }

        System.out.println("================================================================================");

        String [][][] animals2 = new String [][][]{{birds}, {insects}, {mammals}, {birds}, {insects}};

        for (int i = 0; i < animals2.length; i++){
            for (int k = 0; k < animals2[i].length; k++){
                System.out.println(Arrays.toString(animals2[i][k]));
                }
            }
        }
    }
