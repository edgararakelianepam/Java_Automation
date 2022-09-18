package base;

import base.Cars;

public class Toyota extends Cars {
    public Toyota(int years, String model, int power, String color) {
        super(years, model, power, color);

    }

    @Override
    public void accelerationUpTo100() {
        System.out.println(getModel() + " accelerates to 100 in 8 sec.");

    }

    public Toyota(){

    }

    public void autoFeatures(){
        System.out.println(getModel() + " has autotransmission");
    }

    @Override
    public void fuelType() {
        System.out.println(getModel() + " is hybrid");
    }
}
