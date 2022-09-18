package base;

import base.Cars;

public class Mercedes extends Cars {
    public Mercedes(int years, String model, int power, String color) {
        super(years, model, power, color);

    }

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
