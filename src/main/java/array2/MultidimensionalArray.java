package array2;

public class MultidimensionalArray {
    public static void main(String[] args) {

       boolean boolArr [][] = {{true, true, true}, {false}};
       short [][] shortArr = new short[2][1];
       shortArr[0][0]= 10;
       shortArr[1][0]= 3;


       System.out.println(shortArr.length); //2

       float [][] floatArr = new float[10][80];
       floatArr[0][0]= 320.5f;
       floatArr[0][1]= 32.5f;
       floatArr[0][2]= 3.5f;
       floatArr[0][3]= 123.5f;
       floatArr[0][4]= 43.5f;
       floatArr[0][5]= 365.5f;
       floatArr[0][6]= 3250.5f;
       floatArr[0][7]= 3266.5f;

       floatArr[1][0]= 1.5f;
       floatArr[1][1]= 1.6f;
       floatArr[1][2]= 3.5f;
       floatArr[1][3]= 2.5f;
       floatArr[1][4]= 4.5f;
       floatArr[1][5]= 5.5f;
       floatArr[1][6]= 6.5f;
       floatArr[1][7]= 7.5f;
       floatArr[1][8]= 8.5f;
       floatArr[1][9]= 8.5f;




    }
}
