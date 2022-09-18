package base;

import base.Cars;

    public class Ford extends Cars {
        public Ford(int years, String model, int power, String color) {
        super(years, model, power, color);
    }

    public Ford(){

    }

    public void autoFeatures(){
        System.out.println(getModel() + " has autostart");
    }

    @Override
    public void fuelType() {
        System.out.println(getModel() + " is gasoline");
    }
}
