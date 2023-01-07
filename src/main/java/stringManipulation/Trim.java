package stringManipulation;

public class Trim {
    public static void main(String[] args) {

        String shop = "Amazon";
        System.out.println(shop.trim());

        String anotherShop = "     Whole Foods    ";
        System.out.println("anotherShop's length: " + anotherShop.length());
        anotherShop = anotherShop.trim();
        System.out.println("anotherShop's length: " + anotherShop.length());

        String shop3 = "   M   arianos shop  ";
        System.out.println(shop3.trim());
        System.out.println(shop3.trim().trim().replace(' ', ' '));

        shop3 = shop3.trim();
        System.out.println();







    }
}
