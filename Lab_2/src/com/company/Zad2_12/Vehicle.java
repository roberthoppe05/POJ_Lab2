package com.company.Zad2_12;

public class Vehicle {
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


    public void range() {
        System.out.println("Zasieg (km): " + getFuelcap() * getFuelPerKm());


    }
}
