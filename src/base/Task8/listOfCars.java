package base.Task8;

import java.util.ArrayList;
import java.util.List;

public abstract class listOfCars extends Cars {

    public static void getList() {
        List<String> carsList1 = new ArrayList<>();
        carsList1.add("Toyota");
        carsList1.add("Ford");
        carsList1.add("Mercedes");
        carsList1.add("BMW");
        System.out.println("This cars in our dilership: " + carsList1);

    }

    public static void carBought() {
        List<String> carsList2 = new ArrayList<>();
        carsList2.add("Toyota");
        carsList2.add("Ford");
        carsList2.add("Mercedes");
        carsList2.add("BMW");
        carsList2.remove(2);
        System.out.println("One of the car is bought, and now we have " + carsList2);
    }

    public static void carsUpdated() {
        List<String> carsList3 = new ArrayList<>();
        carsList3.add("Toyota");
        carsList3.add("Ford");
        carsList3.add("Mercedes");
        carsList3.add("BMW");
        carsList3.set(1, "Lexus");
        System.out.println("One of the car is bought, and now we have" + carsList3);
    }

    public static void carsHashCode() {
            String toyota = "Toyota";
            String ford = "Ford";
            String bmw = "Bmw";
            String mercedes = "Mercedes";
            if (toyota.equals(ford) || toyota.equals(bmw) || toyota.equals(mercedes)) {
                System.out.println("Equal" + " " + toyota.hashCode() + " " + ford.hashCode() + " " + bmw.hashCode() + " " + mercedes.hashCode());
            } else {
                System.out.println("Not equal: Toyota hashcode "  + toyota.hashCode() + " Ford hashcode " + ford.hashCode() +
                        " BMW hashcode " + bmw.hashCode() + " Mercedes " + mercedes.hashCode());
            }

        }
    }

