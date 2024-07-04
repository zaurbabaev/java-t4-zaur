package az.edu.itbrains.lesson11.car.models;

public class Car {
    private int id;
    private String model;
    private String brand;
    private double millage; // nə qədər yol gedib
    private double fuel; // benzin
    private double maxFuel; // maximum benzin tutumu
    private int fuelPerMillage; // 100km nə qədər yandırır

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public double getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(double maxFuel) {
        this.maxFuel = maxFuel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMillage() {
        return millage;
    }

    public void setMillage(double millage) {
        this.millage = millage;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getFuelPerMillage() {
        return fuelPerMillage;
    }

    public void setFuelPerMillage(int fuelPerMillage) {
        this.fuelPerMillage = fuelPerMillage;
    }


}
