package ifElseLogicalOperators;

public class IfElseCondition {
    public static void main(String[] args) {

   int a = 100;
   int b = 200;


   if (a > b){
       System.out.println(b + "is more than " + b);
   }else {
       System.out.println(b + "is not more than " + b);
       ;
   }
 if (a ==b){
     System.out.println("a is equal to b");
 }else {
     System.out.println("a is not equal to b");
 }


 String welcomeSign = "Welcome to California!";
 String stateName = "California";

  boolean bb = welcomeSign.contains(stateName); //true


  if (bb){
      System.out.println(welcomeSign + " contains " + stateName);
  }else  if(welcomeSign.contains(stateName)){
      System.out.println("welcome sign does not contain statename"); }
        System.out.println("A code after if condition");






































    }
}
