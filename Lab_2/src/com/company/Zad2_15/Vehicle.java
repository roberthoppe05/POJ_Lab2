package com.company.Zad2_15;

public class Vehicle {
    private String name;
    private int passangers;
    private int fuelcap;
    private int fuelPerKm;

    public int getPassangers() {
        return passangers;
    }

    public void setPassangers(int passangers) {
        this.passangers = passangers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getFuelPerKm() {
        return fuelPerKm;
    }

    public void setFuelPerKm(int fuelPerKm) {
        this.fuelPerKm = fuelPerKm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void range(Vehicle vehicle) {
        int range = vehicle.getFuelcap() * vehicle.getFuelPerKm();
        System.out.println(vehicle.getName() + " przewozi " + vehicle.getPassangers() +
                " osob na odleglosc " + range + " kilometrow");

    }
    public void how(Vehicle vehicle){
        double how = vehicle.getFuelcap()/vehicle.getFuelPerKm();
        System.out.println(vehicle.getName() + " potrzebuje " + how + " litrow paliwa.");
    }
}
