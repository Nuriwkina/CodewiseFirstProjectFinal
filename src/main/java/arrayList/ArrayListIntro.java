package arrayList;
import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        /*
        add() is used to add values-elements inside arrayList
         */
        groceryList.add("milk");
        groceryList.add("bread");
        groceryList.add("apples");

        System.out.println(groceryList);

        /*
        get(int index) will return the element form given index
         */
        System.out.println(groceryList.get(1));
        System.out.println(groceryList.get(2));

        groceryList.add("ice cream");
        groceryList.add("peanut butter");
        groceryList.add("12");

        System.out.println(groceryList);
//        =====================================


        /*
        non generic Array List is used
        to store different types of data
         */

        ArrayList toDoList = new ArrayList();
        toDoList.add("hello");
        System.out.println(toDoList);

        /*
        generic ArrayList is used with diamond sign,
        inside diamond sign you put data type
         */

        ArrayList <String> toDoList2 = new ArrayList<>();
        toDoList2.add("clean house");
        toDoList2.add("read books");
        toDoList2.add("laundry");
        toDoList2.add("grocery shopping");
        toDoList2.add("watch movie");
        toDoList2.add("cook dinner");

        System.out.println(toDoList2.get(3));
        int size = toDoList2.size();
        // size() is for ArrayList, length() for Array

        /* print all elements using for loop
        read books - DONE
        grocery shopping - DONE
         */

        for (int i = 0; i < toDoList2.size(); i++){
            System.out.println(toDoList2.get(i) + " - DONE");
        }


        ArrayList <String> cars = new ArrayList<>();
        cars.add("Moserati");
        cars.add("Lamborgini");
        cars.add("Porche");
        cars.add("Mazda");
        cars.add("Bugatti");

        System.out.println(cars);
        cars.set(3, "Ferrari");  //=====> changed Mazda to Ferrari

        System.out.println(cars);

        // change Moserati to Mercedes
        cars.set(0, "Mercedes");
        System.out.println(cars);

        //change Bugatti to Aston Martin
        cars.set(4, "Aston Martin");
        System.out.println(cars.get(4));

        System.out.println("size: " + cars.size());
        System.out.println(cars.get(1));  //==> 1 returns Lambo

        cars.remove(0);  // ===> remove first element
        System.out.println(cars);
        System.out.println(cars.get(0)); //==> returns Lambo

        cars.remove(2);
        System.out.println(cars.size());
        System.out.println(cars);
        //Lambo, Porche, Aston Martin
        //
        /*
        Ferrari
        Moserati
        0          1           2      3          4
        [Moserati, Lamborgini, Porche, Ferrari, Aston Martin]
         */

        //add (int index, String element)
        cars.add(0, "Moserati");
        cars.add(3, "Ferrari");
        System.out.println(cars);







    }




    }

