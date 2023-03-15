package methodOverloding;

import array.ArraysToString;

import java.util.Arrays;

public class PracticeOverloadingArrays {
    /*
    create rotate(), which takes:
                      array of ints
                      String rotate
    if rotate = left: 1,2,3 => 2,3,1
    if rotate = right: 1,2,3 => 3,2,1
    return rotated int []
     */
    public static int[] rotate(int[] array, String rotate) {
        if (rotate.equals("left")) {
          int [] newRotated = {array [1], array[2], array[0]};
             return newRotated;

        } else if (rotate.equals("right")) {
          int [] newRotated = {array [2], array[1], array[0]};
            return newRotated;

        }
return array;
    }

    public static void main(String[] args) {
        int [] array1 = {1,2,3};
        int [] array2 = {1,2,3};
        System.out.println(Arrays.toString(rotate(array1, "left"))); //3,2,1
        System.out.println(Arrays.toString(rotate(array2, "left"))); //5,6,4
        System.out.println(Arrays.toString(rotate(array1, "right"))); //3,2,1
        System.out.println(Arrays.toString(rotate(array1, "down"))); //1,2,4
    }
}