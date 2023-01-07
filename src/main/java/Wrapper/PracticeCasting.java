package Wrapper;

public class PracticeCasting {
    public static void main(String[] args) {

        //Convert String to primitive int
        String intNumber = "19932";
        Integer intNumber2 = Integer.valueOf(intNumber);

        int r = intNumber2;

        String StringNumber = "19932";
        Integer StringNumber2 = Integer.valueOf(StringNumber);
        int r1 = intNumber2;

        //Convert stringNumber  to primitive double

        double dd = Double.valueOf(StringNumber);
        double dd1 = dd;

        Short sh = Short.valueOf(StringNumber);
        short sh2 = sh;
        long ll = Long.valueOf(StringNumber);

        /*
        ValueOf() returns Object
        parseInt() returns primitives
         */

        Integer.parseInt("123"); //==> int primitive = 123
        Integer.valueOf("123"); //==> Object Integer = 123

        String int1 = "123";
        Integer int2 = Integer.valueOf(int1);
        Double d1  = Double.valueOf(int1);
        Short s1 = Short.valueOf(int1);
        Byte b1 = Byte.valueOf(int1);

        Integer intObj = Integer.valueOf("123");
        String stringObj = String.valueOf(intObj);
        Double stringObj1 = Double.valueOf(intObj);

        /*
        convert to primitive
         */

        Integer intOnj = Integer.valueOf("200");
        int int3 = intObj;
        int int4 = Integer.valueOf(intObj);
       Double myDouble = Double.valueOf(123.432);
       double double1 = myDouble;
       Double myDouble2 = Double.parseDouble("12345.211");
       double double2 = myDouble2;

       Boolean bo = Boolean.valueOf(true);
       boolean boolean1 = bo;
        Boolean bo2 = Boolean.valueOf("False");
        boolean boolean2 = bo2;














    }
}
