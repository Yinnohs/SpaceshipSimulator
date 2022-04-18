package spaceShip;

public class SpaceShip {
    private String name;
    private String galacticLicensePlate;
    private double aceleration;
    private double speedY;
    private double speedX;
    private double coordinateY;
    private double coordinateX;
    private double directionY;
    private double directionX;

    public SpaceShip(String name, String galacticLicensePlate){
        this.name = name;
        this.galacticLicensePlate = galacticLicensePlate;
        this.aceleration = 9.8;
        this.speedY = 0;
        this.speedX = 0;
        this.coordinateX = 1;
        this.coordinateY = 1;
        this.directionX = 0;
        this.directionY = 0;
    }

    public int speedUpX(double acceleration){
        this.speedX += acceleration;
        this.coordinateX += this.speedX;
        return ((int) Math.floor(this.coordinateX));
    }

    public  double speedUpY(double acceleration){
        this.speedY += acceleration;
        this.coordinateY += this.speedY;
        return ((int) Math.floor(this.coordinateY));
    }

    public void brake(){
        this.aceleration -= this.aceleration;
    }

    public void EmergencyStop(){
        this.speedX = 0;
        this.speedY = 0;
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
