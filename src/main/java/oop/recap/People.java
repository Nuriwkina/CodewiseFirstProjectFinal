package oop.recap;

import oop.Home;

public class People{
    public static void main(String[] args) {

        Home h1 = new Apartment();
        h1.lock();
        h1.enter();


        IPhone.WaterResistable wr = (IPhone.WaterResistable) new IPhone();
        wr.takeUnderWater();
        wr.keepTheDeviceProtected();




    }
}