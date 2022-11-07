package base.Lesson7_IO.Task7_rewrite;

import java.io.Serializable;

public class Ford implements Serializable {
    private int years;
    private String model;
    public Ford(int years, String model) {
        this.years = years;
        this.model = model;
    }

    public String toString() {
        return "Ford Explorer{" +
                "age=" + years +
                ", name='" + model + '\'' +
                '}';
    }
}