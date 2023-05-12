package org.example;

import java.util.Scanner;

public class CarParkInformation {
    private final int carSpaceCapacity = 30;
    private final int largeSpaceCapacity = 10;
    private final int motorcycleSpaceCapacity = 5;

    private int occupiedCarSpaces = 0;
    private int occupiedMotorcyclesSpaces = 0;
    private int occupiedLargeSpaces = 0;
    private Scanner keyboardInput = new Scanner(System.in);
    private int selection;

    public void admitACar() {
        if (occupiedCarSpaces < carSpaceCapacity) {
            occupiedCarSpaces++;
            pressEnterToContinue("\n    Access Granted.");
            return;
        }
        if (occupiedLargeSpaces < largeSpaceCapacity) {
            occupiedLargeSpaces++;
            pressEnterToContinue("\n    Access Granted.");
            return;
        }
        pressEnterToContinue("\n    Car park is full: Access denied.");
    }

    public void admitAVan() {
        if (occupiedLargeSpaces < largeSpaceCapacity) {
            occupiedLargeSpaces++;
            pressEnterToContinue("\n    Access Granted.");
            return;
        }
        if (occupiedCarSpaces < carSpaceCapacity - 2) {
            occupiedCarSpaces += 3;
            pressEnterToContinue("\n    Access Granted.");
            return;
        }
        pressEnterToContinue("\n    Car park is full: Access denied.");
    }

    public void admitAMotorcycle() {
        if (occupiedMotorcyclesSpaces < motorcycleSpaceCapacity) {
            occupiedMotorcyclesSpaces++;
            pressEnterToContinue("\n    Access Granted.");
            return;
        }
        if (occupiedCarSpaces < carSpaceCapacity) {
            occupiedCarSpaces++;
            pressEnterToContinue("\n    Access Granted.");
            return;
        }
        if (occupiedLargeSpaces < largeSpaceCapacity) {
            occupiedLargeSpaces++;
            pressEnterToContinue("\n    Access Granted.");
            return;
        }
        pressEnterToContinue("\n    Car park is full: Access denied.");
    }

    public void exitACar() {
        if (occupiedCarSpaces > 0) {
            occupiedCarSpaces--;
            pressEnterToContinue("\n    A car has left the car park");
            return;
        }
        if(occupiedLargeSpaces > 0){
            occupiedLargeSpaces--;
            pressEnterToContinue("\n    A car has left the car park");
            return;
        }
        pressEnterToContinue("\n    Error: The carpark is empty.");
    }
    public void exitAVan() {
        if (occupiedCarSpaces > 0) {
            occupiedCarSpaces--;
            pressEnterToContinue("\n    A car has left the car park");
            return;
        }
        if(occupiedLargeSpaces > 0){
            occupiedLargeSpaces--;
            pressEnterToContinue("\n    A car has left the car park");
            return;
        }
        pressEnterToContinue("\n    Error: The carpark is empty.");
    }

    private void pressEnterToContinue(String message) {
        System.out.println(message);
        keyboardInput.nextLine();
    }
}
