package ifElseLogicalOperators;

public class IfElsePractice {
    public static void main(String[] args) {

        int x = 100;
        int y = 20;

        if (x == y){
            System.out.println("x is equal to y");
        }else if (y < x){
            System.out.println("this is my 1 else if code");
        }else if(x > y){
            System.out.println("x is more than y");
        } else{
            System.out.println("this is my else condition");
        }
        System.out.println(x + y);
        //----------


    }
}
