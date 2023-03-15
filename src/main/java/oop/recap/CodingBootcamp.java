package oop.recap;

public class CodingBootcamp extends School {

    public void teachCoding() {
        System.out.println("Coding");
    }
    @Override
    public void teach(){
        System.out.println("Teaching in Bootcamp style");
    }

    @Override
    public void studentEnroll (){
        System.out.println("Enrollment in Coding Bootcamp");
    }

}
