package Wrapper;

import java.util.Scanner;

public class RecapWrapper {
    public static void main(String[] args) {


        Integer c = new Integer(5);
       Integer k2 = Integer.valueOf("4");

       Integer a = new Integer(6);
       Integer b = Integer.valueOf(2);

       Short s = Short.valueOf((short) 1);

       Float k3 = Float.valueOf(11.5f);
       Float k4= Float.valueOf("11");
       Float k5 = 11.5f;

       Short k6 = Short.valueOf("11");
       Short k7 = Short.valueOf((short)11);
        Short k8 = 1;

        Byte k9 = Byte.valueOf((byte)98);
        Byte k10 = Byte.valueOf("33");

        Boolean b1 = Boolean.valueOf("true");
        Boolean b2 = Boolean.valueOf("True");
        Boolean b3 = Boolean.valueOf("false");
        Boolean b4 = Boolean.valueOf("SameString");
        Boolean b5 = Boolean.valueOf("true");
        System.out.println(b4);

        Long s1 = Long.valueOf(8);
        Long s2 = 4l;
        Long s3 = Long.valueOf("45");
        System.out.println(s1);

        Double d = Double.valueOf(44);
        Double d1 = Double.valueOf("23456757.546536754");
        Double d2 = Double.valueOf(7889);
        Double d3 = Double.valueOf(7889.54635);
        System.out.println(d2);










    }
}