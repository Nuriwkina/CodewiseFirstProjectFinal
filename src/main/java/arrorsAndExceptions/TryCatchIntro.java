package arrorsAndExceptions;

import java.io.IOException;

public class TryCatchIntro {
    public static void main(String[] args) {
        sayHello("Hello John");
        String name = "Martin";

        try {
            System.out.println("Inside try block,before exception is thrown");

            if (name.length() < 10) {
                throw new Exception("The length of the name is less than 10");
            }
            System.out.println("Inside try block,after exception is thrown");
        } catch (Exception nameOfYourException) {
            System.out.println("Inside catch block");
        }
        System.out.println("After try catch");


    }



    /////we are throwing here checked exception
    public static void sayBye(String name) throws IOException {
        if(name.startsWith("A")){
            System.out.println("Bye "+ name);
        }else{//////input -output exception
            throw new IOException("name doesnt start with A");
        }

    }
    public static void sayHello(String name){
        if(name==null){
            throw new NullPointerException("null value was given instead of name");
        }else{
            System.out.println("Hello "+ name);
        }
    }


    public static void sayBye2(String name){
        if(name.startsWith("A")){
            System.out.println("Bye "+ name);
        }else {


            try {
                System.out.println("The name should always start with A, else we cant say bye");
                throw new IOException("name doesnt start with A");
            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.out.println("this is the catch block");
            }


        }
    }
}
