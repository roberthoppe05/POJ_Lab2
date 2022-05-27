package com.company.Zad2_11;

import java.io.PrintWriter;

public class VehicleProg {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle();
        Vehicle sportCar = new Vehicle();

        miniVan.passangers = 7;
        miniVan.fuelcap = 60;
        miniVan.fuelPerKm = 10;

        sportCar.passangers = 2;
        sportCar.fuelcap = 30;
        sportCar.fuelPerKm = 15;

        int fpkm = miniVan.fuelcap * miniVan.fuelPerKm;
        int fpks = sportCar.fuelcap * sportCar.fuelPerKm;

        System.out.println("Minivan przewozi " + miniVan.passangers + " osob na odleglosc do " + miniVan.fuelcap * miniVan.fuelPerKm + " kilometrow.");
        System.out.println("Auto sportowe przewozi " + sportCar.passangers + " osob na odleglosc " + sportCar.fuelcap * sportCar.fuelPerKm + " kilometro.");

    }
}
