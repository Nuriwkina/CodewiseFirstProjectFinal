package esensRecapClass;


import stringManipulation.Substring;

public class Monitor {
    public static void main(String[] args) {

       // int num1;   //declaration
        //int num2;
      //  num1 = 5;   // assignment
       // num2 = 10;
        // add(nam1,num2);

        add(5, 6);
        //String city = "Chicago";
      //  welcome(city);


       double afterTax = calculateSaleTax(100);
        System.out.println(afterTax);

       double finalResult = discount20 (afterTax);
        System.out.println("Your total amount to pay: " + finalResult + "$");




    }
                         //variable declaration
    public static void add(int num1, int num2){
        int sum = num1 + num2;
        System.out.println(sum);

    }
    public static void welcome(String someCity){
        System.out.println("Welcome to " + someCity);
    }
    public static double calculateSaleTax(double price){
        double result;
        double salesTax = 100 * 0.06;
        result = 100 + 0.06;
        return result;
    }
    public  static double discount20(double total){
        double result;
        double discount = total * 0.2;
        result = total - discount;
        return result;

    }
}
