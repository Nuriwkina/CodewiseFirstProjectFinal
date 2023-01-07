package classesAndObjects;

public class Cake {

    String name;
    String type;
    double price;
    boolean isGlutenFree;

    public boolean isGlutenFree() {
        return isGlutenFree = true;
    }

        public void display(){
            System.out.println(name + " is the must popular cake in the USA. " + "It is not expensive, which is $ " + price);


    }
    }


    class Bakery {

        public static void main(String[] args) {

            Cake cake = new Cake();
            Cake cheeseCake = new Cake();


            cake.name = "Honey";
            cake.type = "Honey cake";
            cake.price = 50.99;
            cake.isGlutenFree = true;

            System.out.println("The name of the cake: " + cake.name);
            System.out.println("The type of the cake: " + cake.type);
            System.out.println("The price of the cake $  " + cake.price);
            System.out.println("Cake is Gluten free: " + cake.isGlutenFree);

            System.out.println("\n");
            cake.display();


        }
    }

