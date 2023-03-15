package recap;

import java.util.ArrayList;
import java.util.Arrays;

public class RecapArray {
    public static void main(String[] args) {

//array of Strings. Array can store both primitives and objects
        String [] arrayOfBerries = new String[3];
        arrayOfBerries[0] = "blackberry";
        arrayOfBerries[0] = "blueberry";
        arrayOfBerries[0] = "mulberry";
        System.out.println(Arrays.toString(arrayOfBerries));
        System.out.println(Arrays.toString(arrayOfBerries));
        System.out.println(arrayOfBerries.length);


        //arrayList can only store objects, it's resiz
        ArrayList<String> listOfBerries = new ArrayList<>();
        listOfBerries.add("cherry"); //0
        listOfBerries.add("strawberry"); //1
        listOfBerries.add("raspberry"); //2
        System.out.println(listOfBerries); //[cherry, strawberry, raspberry]
        System.out.println(listOfBerries.size()); //returns the number of elements inside array
        listOfBerries.remove(1);
        System.out.println(listOfBerries.size() + " " + listOfBerries); //remove element by value

        listOfBerries.add("golden cherry");
        listOfBerries.add("Californian blueberries");

        //[raspberry, watermelon, golden cherry, California blueberries]
        listOfBerries.add(1, "watermelon");
        System.out.println(listOfBerries);
        boolean hasStrawberry = listOfBerries.contains("strawberry"); //true if element is there, and false if not
        System.out.println(hasStrawberry);

        System.out.println(listOfBerries.contains("golden cherry")); ///true
        System.out.println(listOfBerries.contains("blueberries")); //false
        System.out.println(listOfBerries.contains("Californian blueberries".trim())); //true

        System.out.println(listOfBerries);
        System.out.println(listOfBerries.get(1));//take index number and return element from that index
        System.out.println(listOfBerries.size()-1);//Californian blueberries
        System.out.println(listOfBerries.get(10 + 5 - 12));//Californian blueberries

        listOfBerries.set(0,"sweet raspberry");//updates the element at given index
        System.out.println(listOfBerries.size());

        boolean isEmpty = listOfBerries.isEmpty();//returns true if list is empty, and false if not
        System.out.println(isEmpty);//true

        listOfBerries.add("cherry");
        listOfBerries.add("strawberry");
        listOfBerries.add("raspberry");
        listOfBerries.set(2, "potato");
        System.out.println(listOfBerries);

        //==============================Task-1=================================

        /*each al must have at least 5 elements, print sizes of all arrayList
        create string arraylist with todolist
        create integer arraylist with houseNumbers
        create double arraylist with prices
        create boolean arraylist with true false value
         */

        ArrayList<String> toDoList = new ArrayList<>(listOfBerries);
        System.out.println(toDoList);

        Object obj = listOfBerries.clone(); //it turned arrayList to Object
        System.out.println(obj.toString()); //we tuned Object to String

        for(int i = 0; i <= listOfBerries.size(); i++){
            System.out.println("berry #" + i + " " + listOfBerries.get(i));
        }
        /*
        use for each loop print integer arrayList
        use while  loop to print double arrayList
        use do while loop to print boolean arrayList
         */

       ArrayList<Boolean> boolList = new ArrayList<Boolean>();
       boolList.add(true);
       boolList.add(false);
       boolList.add(true);
       boolList.add(false);
       boolList.add(true);
       boolList.add(true);

       int a = 0;
       String str = " ";
       do {
           str += boolList.get(a) + ", ";
           a = a + 1;
       }while (a < boolList.size());

        System.out.println(str);

        str = str.substring(0, str.length()-2);

    }
}
