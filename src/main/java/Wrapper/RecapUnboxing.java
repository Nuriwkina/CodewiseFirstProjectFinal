package Wrapper;

public class RecapUnboxing {
    public static void main(String[] args) {

        /*
        unboxing ---> convert object to primitive
         */

        Integer a = 10;
        int b = a; // Unboxing

        Integer c = Integer.valueOf("123");
        b = c; // unboxing

        Byte b1 = Byte.valueOf((byte)12);
        Byte b2 = b1;

        Short s1 = Short.valueOf((short)123);
        Short s2 = s1;

        Long l1 = Long.valueOf(1238788);
        Long l2 = l1;





    }
}
