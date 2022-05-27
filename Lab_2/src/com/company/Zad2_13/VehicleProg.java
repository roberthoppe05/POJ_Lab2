package com.company.Zad2_13;


public class VehicleProg {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle();
        Vehicle sportCar = new Vehicle();


        miniVan.setPassangers(7);
        miniVan.setFuelcap(60);
        miniVan.setFuelPerKm(10);


        sportCar.setPassangers(2);
        sportCar.setFuelcap(30);
        sportCar.setFuelPerKm(15);

        System.out.print("Minivan");
        miniVan.range();
        System.out.print("Auto sportowe");
        sportCar.range();

    }
}
