package org.example;

public class Main {
    public static void main(String[] args) {
        CarParkInformation carParkInformation = new CarParkInformation();
        CarParkService carParkService = new CarParkService();
        carParkService.inService(carParkInformation);
    }
}