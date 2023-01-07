package classesAndObjects;

public class Zoo {

    public Zoo(Animal elephant) {
    }

    public static void main(String [] args){

        Animal elephant = new Animal();
        Animal lion = new Animal();
        Animal mouse = new Animal();
        Animal chicken = new Animal();


        elephant.type = " elephant ";
        elephant.color = "gray";
        elephant.size = "large";
        elephant.name = "Dumbo";

        elephant.eats();
        elephant.sleeps();

        lion.type = " cat ";
        lion.color = "yellow";
        lion.size = "medium";
        lion.name  = "Alex";



        lion.play();
        lion.eats();

        chicken.type = " chicken ";
        chicken.color = "orange";
        chicken.size = "medium";
        chicken.name = "Poki";

        chicken.eats();
        chicken.play();

        mouse.type = " mouse ";
        mouse.color = "grey";
        mouse.size = "small";
        mouse.name  = "Jerry";

        mouse.eats();
        mouse.sleeps();

    }
}
