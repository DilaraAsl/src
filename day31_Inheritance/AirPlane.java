package day31_Inheritance;

public class AirPlane extends Vehicle {
    public AirPlane(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void fly() {
        System.out.println(getBrand() + " " + getModel() + " is flying.");
    }
}
