package classes;

public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void diplay() {
        System.out.println("this is brand: " + brand + " model is: " + model + " made year is :" + year);
    }

    public static void main(String[] args) {
        Car C1 = new Car("tesla", "cybertruck", 2020);
        Car c3 = new Car("dacia", "logan", 2006);
        C1.diplay();
        c3.diplay();
    }
}
