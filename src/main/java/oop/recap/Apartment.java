package oop.recap;

import oop.Home;

public  class Apartment extends Home {


    @Override
    public void enter() {
        System.out.println("Entering to apartment");
    }

    @Override
    public void lock() {
        System.out.println("Locking the apartment");
    }
}
