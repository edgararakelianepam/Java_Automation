package base;

import base.Cars;

    public class Ford extends Cars {
        public Ford(int years, String model, int power, String color) {
        super(years, model, power, color);
    }

        @Override
        public void accelerationUpTo100() {
            System.out.println(getModel() + " accelerates to 100 in 10 sec.");

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
