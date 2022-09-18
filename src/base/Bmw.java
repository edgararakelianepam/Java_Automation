package base;

import base.Cars;

    public class Bmw extends Cars {
        public Bmw(int years, String model, int power, String color) {
        super(years, model, power, color);
    }

        @Override
        public void accelerationUpTo100() {
            System.out.println(getModel() + " accelerates to 100 in 3 sec.");

        }

        public Bmw(){

    }
    public void autoFeatures(){
        System.out.println(getModel() + " has autoparking feature");
    }

    @Override
    public void fuelType() {
        System.out.println(getModel() + " is disel");
    }
}
