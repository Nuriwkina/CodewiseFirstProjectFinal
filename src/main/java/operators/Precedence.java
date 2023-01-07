package operators;

public class Precedence {
    public  static void main (String [] arg){

        int x = 2 + 3 * 2; //8
        int w  = 2 + 3 * 2; //8

        x = 5 + (10 / 2) + 20 - 5; //25

        w = 3 * 2 * 10 - 7 + 10 / 3; //56

        System.out.println(w);


        int v = 2 + 3 * 5; //17
        int y = (2 + 3) * 5; //25

        System.out.println(v);
        System.out.println(y);

        //------------

        int a = 5;
        int b = 3;
        int c = 5;
        int g = a = b; //3

        System.out.println("the value of g " + g);

        System.out.println(a);

        c = b = a; //3

        System.out.println(a);

        int s = a + b * (a + c); //29
        s = 5 + 3 * 8;//29

        System.out.println(g);

        int z = 40;
        int n = 10;
        int m = 2;

        int f = z - n + m % 3 + 5 * 2 - ( n = m);
        f = 40 - 10 + 2 + 10 - 2; //40

        System.out.println(f);

        //------------

        int o = 9;
        int k = 4;
        int h = 10;
        int l = 3;

        int sum = 0 % l * k - (h = 2) + 32; //30

        sum = 0 * 4 - 2 + 32; //30

        System.out.println(sum);



        int i = -10;
        int e = -20;

        System.out.println(i + e); //10




















    }
}
