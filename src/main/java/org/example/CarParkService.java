package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CarParkService {

    private Scanner keyboardInput = new Scanner(System.in);
    private int selection;

    public void inService(CarParkInformation carParkInformation) {
        while (true) {
            System.out.println("\n\n     Welcome to Syds Car Park. Please select an option: ");
            System.out.println("\n    1) Admit Car");
            System.out.println("\n    2) Admit Motorcycle");
            System.out.println("\n    3) Admit Van");
            System.out.println("\n    4) Exit Car");
            System.out.println("\n    5) Exit Motorcycle");
            System.out.println("\n    6) Exit Van");
            System.out.println("\n    7) Display Car Park Status");

            try {
                selection = keyboardInput.nextInt();
                keyboardInput.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\nIncorrect selection");
                keyboardInput.nextLine();
                return;
            }
            switch (selection) {
                case 1:
                    carParkInformation.admitACar();
                    break;
                case 2:
                    carParkInformation.admitAVan();
                    break;
                case 3:
                    carParkInformation.admitAMotorcycle();
                    break;
                case 4:
                    carParkInformation.exitACar();
                    break;
                default:
                    // code block
            }

        }
    }
}
