package base;

public class MainCarsMethod {

    public static void main(String[] args) {
        //1)
        Bmw bmw = new Bmw();
        bmw.setYears(5);
        bmw.setModel("Bmw");
        bmw.setPower(170);
        bmw.setColor("white");

        //2)
        Ford ford = new Ford();
        ford.setYears(7);
        ford.setModel("Ford");
        ford.setPower(150);
        ford.setColor("Blue");

        //3)
        Mercedes mercedes = new Mercedes();
        mercedes.setYears(4);
        mercedes.setModel("Mercedes");
        mercedes.setPower(200);
        mercedes.setColor("Black");

        //4)
        Toyota toyota = new Toyota();
        toyota.setYears(2);
        toyota.setModel("Toyota");
        toyota.setPower(190);
        toyota.setColor("Red");


        System.out.println(bmw.getYears() + " year old " + bmw.getModel() + ", " + bmw.getPower() + " horse powers, " + bmw.getColor() + " color");
        System.out.println(ford.getYears() + " year old " + ford.getModel() + ", " + ford.getPower() + " horse powers, " + ford.getColor() + " color");
        System.out.println(mercedes.getYears() + " year old " + mercedes.getModel() + ", " + mercedes.getPower() + " horse powers, " + mercedes.getColor() + " color");
        System.out.println(toyota.getYears() + " year old " + toyota.getModel() + ", " + toyota.getPower() + " horse powers, " + toyota.getColor() + " color");

        Cars.carsFeatures();
        bmw.autoFeatures();
        ford.autoFeatures();
        mercedes.autoFeatures();
        toyota.autoFeatures();
        ford.fuelType();
        bmw.fuelType();
        mercedes.fuelType();
        toyota.fuelType();
        ford.tyrePressureInfo();
        bmw.tyrePressureInfo();
        mercedes.tyrePressureInfo();
        toyota.tyrePressureInfo();


    }

}
