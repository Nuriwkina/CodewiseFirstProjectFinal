package classesAndObjects;

public class Garage {

            public static void main(String[] args) {


                Car mercedes = new Car();
                Car rangeRover = new Car();
                Car lexus = new Car();
                Car toyota = new Car();

                String car1 = "Mercedes";
                System.out.println("\nMercedes");
                mercedes.tires = 4;
                mercedes.wheel =4;
                mercedes.window = 6;
                mercedes.lights = 4;
                mercedes.color = "Red";
                mercedes.year = 2023;
                mercedes.price = 70000;

                mercedes.driving();
                mercedes.stopped();
                mercedes.heating();
                mercedes.cooling();
                mercedes.playMusic();
                mercedes.isExpensive();

                String car2 = "RangeRover";
                System.out.println("\nRange Rover");
                rangeRover.tires = 4;
                rangeRover.wheel = 4;
                rangeRover.window = 6;
                rangeRover.lights = 4;
                rangeRover.color = "Black";
                rangeRover.year = 2020;
                rangeRover.price = 100000;

                rangeRover.driving2();
                rangeRover.stopped2();
                rangeRover.heating2();
                rangeRover.cooling2();
                rangeRover.playMusic2();
                rangeRover.isExpensive2();

                String car3 = "Lexus";
                System.out.println("\nLexus");
                lexus.tires = 4;
                lexus.wheel = 4;
                lexus.window = 6;
                lexus.lights = 4;
                lexus.color = "Yellow";
                lexus.year = 2007;
                lexus.price = 50000;

                lexus.driving3();
                lexus.stopped3();
                lexus.heating3();
                lexus.cooling3();
                lexus.playMusic3();
                lexus.isExpensive3();


                String car4 = "Toyota";
                System.out.println("\nToyota");
                toyota.tires = 4;
                toyota.wheel = 4;
                toyota.window = 6;
                toyota.lights = 4;
                toyota.color = "White";
                toyota.year = 2005;
                toyota.price = 10000;
                
                toyota.driving4();
                toyota.stopped4();
                toyota.heating4();
                toyota.cooling4();
                toyota.playMusic4();
                toyota.isExpensive4();


            }
}
