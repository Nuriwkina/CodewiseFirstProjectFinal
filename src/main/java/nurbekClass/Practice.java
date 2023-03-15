package nurbekClass;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number: ");
        int num = scanner.nextInt();

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jazzy");
        names.add("Lora");
        names.add("Nurbek");
        names.add("Anar");
        names.add("Maks");
        names.add("test");
        names.add("Aliana");
        names.add("Aidana");
        names.add("Ais");


        System.out.println(names);

        for (int Bishkek = 0; Bishkek < names.size(); Bishkek++) {

            if (names.get(Bishkek).length() == num) {
                //to do something
                System.out.println("to do something " + names.get(Bishkek));
            }


        }

    }
}


