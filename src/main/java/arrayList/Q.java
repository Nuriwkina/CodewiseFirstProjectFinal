package arrayList;

import java.util.ArrayList;

public class Q {
    public static void main(String[] args) {


        ArrayList<String> carModels = new ArrayList<>();
        carModels.add("mercedes");
        carModels.add("audi");
        carModels.add("bmw");
        carModels.add("tesla");
        carModels.add("toyota");
        carModels.add("kia");
        carModels.add("lexus");
        carModels.add("audi");

        System.out.println(carModels);


        if (carModels.size() < 25) {
            carModels.add("Paggani");
            System.out.println(carModels);
        }
        if (!carModels.contains("audi")) {
            carModels.add("audi");
            System.out.println(carModels);
        }
     String save =carModels.get(carModels.size()-1);

        carModels.set(8, "mercedes");
        System.out.println(carModels);

     carModels.set(0,save);
        System.out.println(carModels);

        String saveTheCar = carModels.get(0);
    carModels.set(0, carModels.get(carModels.size()-1));
    carModels.set(carModels.size()-1,saveTheCar);
        System.out.println(carModels);

    }
}

