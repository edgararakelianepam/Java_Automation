package base;

public abstract class Cars implements TyrePressureControl {
    private int years;
    private String model;
    private int power;
    private String color;

<<<<<<< HEAD
    public class BodyType { //inner class
        private String bodytype;

        public BodyType(String bodytype) {
            this.bodytype = bodytype;
        }


        @Override
        public String toString() {
            return "BodyType{" +
                    "bodytype='" + bodytype + '\'' +
                    '}';
        }

    }

    public static class YearComparator { // static nested class
        public boolean compare(Cars mercedes, Cars toyota) {
            return (mercedes.years == toyota.years);
        }
    }

    public abstract void accelerationUpTo100(); //anonymous


=======
>>>>>>> origin/master
    public int getYears() {
        return years;
    }

    public final String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public final String getColor() {
        return color;
    }

    public void setYears(int years) {
        if (years > 0) {
            this.years = years;
        } else {
            System.out.println("Invalid years");
        }
    }

    public void setModel(String model) {
        if (model.isEmpty()) {
            System.out.println("Enter model name");
        } else {
            this.model = model;
        }
    }

    public void setPower(int power) {
        if (power > 50) {
            this.power = power;
        } else {
            System.out.println("Invalid power");
        }
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("Enter color");
        } else {
            this.color = color;
        }
    }

<<<<<<< HEAD
    public Cars() {
=======
    public Cars(){
>>>>>>> origin/master

    }

    public Cars(int years, String model, int power, String color) {
        System.out.println("Cars(year, model)");
        this.years = years;
        this.model = model;
        this.power = power;
        this.color = color;
    }

<<<<<<< HEAD

    public static final void carsFeatures() {
        System.out.println("Cars have auto-features");
    }

    public void autoFeatures() {
=======
    public static final void carsFeatures(){
        System.out.println("Cars have auto-features");
    }

    public void autoFeatures(){
>>>>>>> origin/master
    }

    public abstract void fuelType();

    @Override
    public void tyrePressureInfo() {
<<<<<<< HEAD
        if (tyre_pressure < 2) {
            System.out.println("Attention! Your " + getModel() + " need to check tyre pressure");
        } else {
            System.out.println(getModel() + " tyre pressure is OK");
=======
        if (tyre_pressure<2){
            System.out.println("Attention! Your " + getModel() + " need to check tyre pressure");
        } else {
            System.out.println(getModel() + " tyre pressure is OK");;
>>>>>>> origin/master
        }
    }
}
