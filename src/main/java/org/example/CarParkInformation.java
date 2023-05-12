package org.example;

import java.util.Scanner;

public class CarParkInformation {
    private final int carSpaceCapacity = 30;
    private final int largeSpaceCapacity = 10;
    private final int motorcycleSpaceCapacity = 5;

    private int  totalCarSpaces = 0;
    private int totalMotorcyclesSpaces = 0;
    private int totalLargeSpaces = 0;
    private Scanner keyboardInput = new Scanner(System.in);
    private int selection;

    public void admitACar(){
        if (totalCarSpaces < carSpaceCapacity){
            totalCarSpaces++;
            pressEnterToContinue("\n    Access Granted.");
            return;
        }
        if (totalLargeSpaces < largeSpaceCapacity){
            totalLargeSpaces++;
            pressEnterToContinue("\n    Access Granted.");
            return;
        }
        pressEnterToContinue("\n    Car park is full: Access denied.");
    }
    public void admitAVan(){
        if (totalLargeSpaces < largeSpaceCapacity){
            totalLargeSpaces++;
            pressEnterToContinue("\n    Access Granted.");
            return;
        }
        if (totalCarSpaces < carSpaceCapacity - 2){
            totalCarSpaces+=3;
            pressEnterToContinue("\n    Access Granted.");
            return;
        }
        pressEnterToContinue("\n    Car park is full: Access denied.");
    }


    private void pressEnterToContinue(String message){
        System.out.println(message);
        keyboardInput.nextLine();
    }
}
