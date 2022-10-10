package base.Lesson7_IO;

import java.io.*;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ObjectStreamCars {

    public static void main(String[] args) throws Exception {
        int[] myOptions = new int[]{1, 2, 3};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose an option");
        int option = scanner.nextInt();

        // 1 option
        if (option == 0) {
            try (ByteArrayOutputStream arrayOut = new ByteArrayOutputStream();
                 ObjectOutputStream out = new ObjectOutputStream(arrayOut)) {

                out.writeObject(new Audi(5, " Audi Q5"));
                out.writeObject(new Ford(4, " Ford Explorer"));
                System.out.println(arrayOut.size());

                byte[] array = arrayOut.toByteArray();

                for (byte b : array) {
                    System.out.print((char) b);
                }
                System.out.println();

                ByteArrayInputStream arrayIn = new ByteArrayInputStream(array);
                ObjectInputStream in = new ObjectInputStream(arrayIn);

                Audi audi = (Audi) in.readObject();
                Ford ford = (Ford) in.readObject();
                System.out.println(audi);

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        //2 option
        else if (option == 1) {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Lesson7_IO/car.txt"))) {
                Audi audi = new Audi(4, "Q5");
                Ford ford = new Ford(4, " Ford Explorer");
                out.writeObject(audi);
                out.writeObject(ford);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Lesson7_IO/car.txt"))) {
                Audi audi = (Audi) in.readObject();
                Ford ford = (Ford) in.readObject();
                System.out.println(audi);
                System.out.println(ford);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        //3 option
        else if (option == 2) {
            System.out.println("Quit programm");
        }
        // exception
        else {
            try {
                myOptions[option] = 3;
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println(exc + " Wrong option");
            }
        }
    }
}

