package accessModifiers;

public class Client {

  public  String name = "John Doe";
   public  String dob = "23111989";
    String address = "123 Abc street";

    private int ssn = 23111989;
    private double balance = 45000;

    protected boolean isMarried = true;
    double totalIncome = 150000.00;

    protected static boolean isHappy = true;

    public static void payMoney(){
        System.out.println(isHappy);
        System.out.println(new Client().isMarried);

    }
    protected static void giveGift(){

    }
}
