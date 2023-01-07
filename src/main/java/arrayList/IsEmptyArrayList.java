package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsEmptyArrayList {
    public static void main(String[] args) {

        ArrayList<String> companies = new ArrayList<>();
        boolean isListEmpty = companies.isEmpty();

        System.out.println("Is companies List empty? " + isListEmpty);


        companies.add("Google");
        companies.add("Microsoft");
        companies.add("Bank of America");
        companies.add("Cisco");
        companies.add("Oracle");
        companies.add("Uber");
        companies.add("Slack");
        companies.add("Apple");
        companies.add("Netflix");


        isListEmpty = companies.isEmpty();
        System.out.println(isListEmpty);// false
        /*
        convert ArrayList to Array
         */

        String[] arrayOfCompanies = new String[companies.size()];

        companies.toArray(arrayOfCompanies);

        System.out.println(Arrays.toString(arrayOfCompanies));

        /*
        convert Array to ArrayList
         */

        String[] geeks = {"Saikal", "Myrzakhan", "Ilgiz", "Zhamal"};

        List<String> arrayListGeeks = Arrays.asList(geeks);
        /*
        convert arrayListGeeks to Array
         */
        String[] aarrayOfGeeks = new String[arrayListGeeks.size()];
        arrayListGeeks.toArray(aarrayOfGeeks);

        /*
        another way to convert array to arrayList
         */

        String[] testers = {"Daniel", "Aichurok", "Nazima", "Aimeden"};
        List<String> al = new ArrayList(Arrays.asList(testers));

        System.out.println(al);
                /*
                Using for each loop, print testers:
                for each: Daniel

                using while loop, print al:
                while loop: Daniel

                Using do while loop, print arrayOfGeeks:
                do while loop: Aichurok

                Using for loop, print arrayListGeeks:
                for loop: Aimeden
                 */
        for (String tester : testers) {
            System.out.println("for each: " + tester);

        }
        int i = 0;
        while (i < al.size()) {
            System.out.println("while loop: " + al.get(i));
            i++;


        }
        int g = 0;
        do {
            System.out.println("do while: " + aarrayOfGeeks[g]);
            g++;

        }
        while (g < aarrayOfGeeks.length);

        for (int r = 0; r < arrayListGeeks.size(); r++) {
            System.out.println("for loop: " + arrayListGeeks.get(r));
        }


    }
}
