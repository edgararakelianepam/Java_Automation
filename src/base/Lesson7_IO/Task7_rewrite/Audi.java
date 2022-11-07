package base.Lesson7_IO.Task7_rewrite;

import java.io.Serializable;

public class Audi implements Serializable {
    private int years;
    private String model;

    public Audi(int years, String model) {
        this.years = years;
        this.model = model;
    }

    public String toString() {
        return "Audi Q5{" +
                "age=" + years +
                ", name='" + model + '\'' +
                '}';
    }
}