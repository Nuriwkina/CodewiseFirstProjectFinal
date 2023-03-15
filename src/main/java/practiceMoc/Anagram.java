package practiceMoc;

import java.util.Arrays;

public class Anagram {
    /*
    create a method, which accept two string
    and checks if they are anagram
    anagrams are the words that consist of same letters

    String word1 = a gentleman
    String word2 = elegant man
     */

    public static void main(String[] args) {
        String cv = "aaabbc   11";
        String cb = "11   cbbaaa";

        String bb = "a gentleman", cc = "e legantman";

        System.out.println(isAnagram(cc, bb));
    }


    public static boolean isAnagram(String word1, String word2) {

        word1 = word1.replace(" ", "").toLowerCase();
        word2 = word2.replace(" ", "").toLowerCase();

        if (word1.length() == word2.length()) {

            char[] arr1 = word1.toCharArray();
            char[] arr2 = word2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                return true;
            }

        }
        return false;
    }
}

//////////////////////////////////////
/*
public static boolean isAnagram(String a, String b){
    a = a.toLowerCase().replaceAll(" ", "");
    b = b.toLowerCase().replaceAll(" ", "");


    char[] arrA = a.toCharArray();
    char[] arrB = b.toCharArray();



    Arrays.sort(arrA);
    Arrays.sort(arrB);


    return Arrays.equals(arrA, arrB);
}
}

 */