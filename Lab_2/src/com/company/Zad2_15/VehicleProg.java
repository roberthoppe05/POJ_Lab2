package com.company.Zad2_15;


public class VehicleProg {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle();
        Vehicle sportCar = new Vehicle();

        miniVan.setName("Minivan");
        miniVan.setPassangers(7);
        miniVan.setFuelcap(60);
        miniVan.setFuelPerKm(10);

        sportCar.setName("Auto sportowe");
        sportCar.setPassangers(2);
        sportCar.setFuelcap(30);
        sportCar.setFuelPerKm(15);

        miniVan.how(miniVan);
        sportCar.how(sportCar);

    }
}
