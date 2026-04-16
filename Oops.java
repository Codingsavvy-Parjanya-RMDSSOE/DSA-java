import java.io.*;
import java.util.Scanner;
class Car{
    String brand;
    int price;
    String type;
    int seating;

    Car()
    {
        System.out.println("It is best in segment");
        System.out.println("It is a family car");
    }

    Car(String brand,String type,int price)
    {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }
    void engine()
    {
        System.out.println("it has 1998cc engine");
    }
}

class Oops{
    public static void main(String[] args) {
        Car safari = new Car();
        Car creta = new Car("Hyundai","SUV",1300000);

        safari.brand = "Tata";
        safari.price = 1800000;
        safari.type = "Automatic";
        safari.seating = 7;
        System.out.println(safari.brand);
        safari.engine();
        System.out.println(creta.brand + " " + creta.type + " " + creta.price);
    }
}