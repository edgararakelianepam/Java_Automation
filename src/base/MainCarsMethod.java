package base;

public class MainCarsMethod {

    public static void main(String[] args) {
        //1)
        Bmw bmw = new Bmw();
<<<<<<< HEAD
        bmw.setYears(7);
        bmw.setModel("Bmw");
        bmw.setPower(170);
        bmw.setColor("white");
        Cars.BodyType bodyType = bmw.new BodyType("Sedan");
=======
        bmw.setYears(5);
        bmw.setModel("Bmw");
        bmw.setPower(170);
        bmw.setColor("white");
>>>>>>> origin/master

        //2)
        Ford ford = new Ford();
        ford.setYears(7);
        ford.setModel("Ford");
        ford.setPower(150);
        ford.setColor("Blue");
<<<<<<< HEAD
        Cars.BodyType bodyType1 = ford.new BodyType("hatchback");
=======
>>>>>>> origin/master

        //3)
        Mercedes mercedes = new Mercedes();
        mercedes.setYears(4);
        mercedes.setModel("Mercedes");
        mercedes.setPower(200);
        mercedes.setColor("Black");
<<<<<<< HEAD
        Cars.BodyType bodyType2 = mercedes.new BodyType("Sports-car");
=======
>>>>>>> origin/master

        //4)
        Toyota toyota = new Toyota();
        toyota.setYears(2);
        toyota.setModel("Toyota");
        toyota.setPower(190);
        toyota.setColor("Red");
<<<<<<< HEAD
        Cars.BodyType bodyType3 = toyota.new BodyType("Cabriolet");

        System.out.println("1. BMW " + bmw.getYears() + " year old " + bmw.getModel() + ", " + bmw.getPower() + " horse powers, " + bmw.getColor() + " color"); // bmw
        bmw.autoFeatures();
        bmw.fuelType();
        bmw.tyrePressureInfo();
        System.out.println(bodyType); // bodytype Sedan
        bmw.accelerationUpTo100();
        System.out.println("");

        System.out.println("2. Ford " + ford.getYears() + " year old " + ford.getModel() + ", " + ford.getPower() + " horse powers, " + ford.getColor() + " color"); // ford
        ford.autoFeatures();
        ford.fuelType();
        ford.tyrePressureInfo();
        System.out.println(bodyType1); // bodytype hatchback
        ford.accelerationUpTo100();
        System.out.println("");

        System.out.println("3. Mercedes " + mercedes.getYears() + " year old " + mercedes.getModel() + ", " + mercedes.getPower() + " horse powers, " + mercedes.getColor() + " color"); // mercedes
        mercedes.autoFeatures();
        mercedes.fuelType();
        mercedes.tyrePressureInfo();
        System.out.println(bodyType2); // bodytype sports-car,
        mercedes.accelerationUpTo100();
        System.out.println("");

        System.out.println("4. Toyota " + toyota.getYears() + " year old " + toyota.getModel() + ", " + toyota.getPower() + " horse powers, " + toyota.getColor() + " color"); // toyota
        toyota.autoFeatures();
        toyota.fuelType();
        toyota.tyrePressureInfo();
        System.out.println(bodyType3); // bodytype cabriolet
        toyota.accelerationUpTo100();
        System.out.println("");

        Cars.YearComparator yearComparator = new Cars.YearComparator(); //static nested class
        System.out.println(yearComparator.compare(mercedes, toyota));
        System.out.println(yearComparator.compare(ford, bmw));

=======


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
>>>>>>> origin/master


    }

}
