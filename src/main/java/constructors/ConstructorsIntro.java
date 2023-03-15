package constructors;

public class ConstructorsIntro {

    public ConstructorsIntro(){
        System.out.println("Hello! I am a constructor");


    }
    public ConstructorsIntro(String name){
        System.out.println("Hello " + name + "! This is another constructor with one argument ");
    }

    public static void main(String[] args) {
        ConstructorsIntro object1 = new ConstructorsIntro();
        ConstructorsIntro object2 = new ConstructorsIntro();
    }
}
