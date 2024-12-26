package Encapsulation;
// 
import java.security.PublicKey;
import java.util.Scanner;

public class Car {
    private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    Car() {
        String Comp_name;

    }

    public String getcompany_name() {
        return company_name;
    }

    public void setcompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getmodel_name() {
        return model_name;
    }

    public void setmodel_name(String model_name) {
        this.model_name = model_name;
    }

    public int getyear() {
        return year;
    }

    public void setyear(int year) {
        this.year = year;
    }

    public double getmileage() {
        return mileage;
    }

}

class Encapsulation {
    public static void main(String[] args) {
        Car car = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a company name" + sc);

        car.setcompany_name("TATA");
        car.setmodel_name("Nexzon");
        car.setyear(2023);

        System.out.println("company_name: " + car.getcompany_name());
        System.out.println("model_name : " + car.getmodel_name());
        System.out.println("year: " + car.getyear());
       

    }

}