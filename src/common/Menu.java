package common;

public  class Menu {

    public static void print(){
        System.out.println("What would you like to do?");
        System.out.println("1.-Create a spaceship");
        System.out.println("Q.- Quit app");
    };

    public static void spaceshipMenu(){
        System.out.println("1.- Accelerate");
        System.out.println("2.- Apply break ");
        System.out.println("3.- Emergency stop");
        System.out.println("4.- Show spaceship");
        System.out.println("Q.- Quit");
    }

    public static void spaceShipSelection(){
        System.out.println("Wich type of space ship do u want");
        System.out.println("1.- Normal SpaceShip");
        System.out.println("2.- Cargo");
        System.out.println("Q.- Quit program");
    }
}
