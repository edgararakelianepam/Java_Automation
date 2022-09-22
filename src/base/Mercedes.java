package base;

import base.Cars;

public class Mercedes extends Cars {
    public Mercedes(int years, String model, int power, String color) {
        super(years, model, power, color);
<<<<<<< HEAD
    }

    @Override
    public void accelerationUpTo100() {
        System.out.println(getModel() + " accelerates to 100 in 5 sec.");
    }


=======

    }

>>>>>>> origin/master
    public Mercedes(){

    }

    public void autoFeatures(){
        System.out.println(getModel() + " has autodrive");
    }

    @Override
    public void fuelType() {
        System.out.println(getModel() + " is electrocar");
    }
}
