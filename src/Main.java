import common.Menu;
import spaceShip.Cargo;
import spaceShip.SpaceShip;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // variable imperative programming.
        String[][] spaceGrid = new String[10][50];
        Scanner scanner = new Scanner(System.in);
        boolean startGame = false;
        String userSelection;
        SpaceShip spaceShip = new SpaceShip("a", "test");


        Menu.print();
        userSelection = scanner.nextLine().toUpperCase();

        if (userSelection.equals("1")){
            Menu.spaceShipSelection();
            userSelection = scanner.nextLine().toUpperCase();
            if (userSelection.equals("1")){
                System.out.println("give me the space ship name");
                String spaceShipName = scanner.nextLine();
                System.out.println("give me the space ship galactic license");
                String galaticLicense = scanner.nextLine();
                spaceShip = new SpaceShip(spaceShipName, galaticLicense);
                startGame = true;
            } else if (userSelection.equals("2"))   {
                System.out.println("give me the space ship name");
                String spaceShipName = scanner.nextLine();
                System.out.println("give me the space ship galactic license");
                String galaticLicense = scanner.nextLine();
                spaceShip = new Cargo(spaceShipName, galaticLicense);
                startGame = true;
            }
            System.out.flush();
        }else {
            System.out.println("shutting down application");
        }

        while (startGame){
            System.out.flush();
            userSelection = "";
            Menu.spaceshipMenu();
            userSelection = scanner.nextLine().toUpperCase();
            switch (userSelection){
                case "1":
                    System.out.println("Add the acceleration");
                    float acceleration = Float.parseFloat(scanner.nextLine());
                    System.out.println("the actual position is : " + spaceShip.speedUp(acceleration));
                    break;
                case "2":
                    spaceShip.brake();
                    System.out.println("Stopping the space ship");
                    System.out.println("Current acceleration = " + spaceShip.getAceleration());
                    break;
                case "3":
                    spaceShip.emergencyStop();
                    System.out.println("Stopping spaceShip");
                    break;
                case "4":
                    System.out.println("Showing Spaceship \n ");
                    System.out.println(spaceShip.toString() + "\n");
                    break;
                case "Q" :
                    System.out.println("Quitting program");
                    startGame = false;
                    break;
                default:
                    System.out.println("please insert one of the options");
            }
        }

    }
}
