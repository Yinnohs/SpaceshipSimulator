package spaceShip;

import java.util.Scanner;

public class CustomShip extends SpaceShip{
    private String shipArt="none";

    public CustomShip(String name, String galacticLicensePlate) {
        super(name, galacticLicensePlate);
        createShipArt();
        if (this.shipArt.equals("none")){
            throw new Error("this ship has no art, thus you cannot play :(");
        }
    }

    public void createShipArt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("show me how is going to be your ship");
        this.shipArt = scanner.nextLine();
        scanner.close();
    }

    @Override
    public String toString(){
        return this.shipArt;
    }
}