package spaceShip;

public class Cargo extends SpaceShip {
    private final int MAXLOAD = 50;
    private final int CONTAINER = 1;

    private int currentContainers;
    public Cargo(String name, String galacticLicensePlate) {
        super(name, galacticLicensePlate);
    }

    public void load() {
        if ((this.currentContainers + CONTAINER) > this.MAXLOAD){
            System.out.println("ERROR ERROR, cannot fit more containers into the cargo!");
        }else {
            this.currentContainers += CONTAINER;
            System.out.println("Added a containers to the cargo");
            System.out.println("space left: " + (this.MAXLOAD - this.currentContainers) + " / " + this.MAXLOAD);
        }
    }

    public  void  unload(){
        if (this.currentContainers == 0){
            System.out.println("this cargo is empty");
        }else {
            this.currentContainers -= CONTAINER;
            System.out.println("One container has been unload, total containers: " + this.currentContainers);
        }
    }

    @Override
    public String toString(){
        return "__\n" +
                "|  " + "\\n"+
                "=[_|H)--._____\n"+
                "=[+--,-------'\n" +
                "[|_/\"\"";
    }
}
