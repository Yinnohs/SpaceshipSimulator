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
        this.aceleration = 1.0;
        this.speedY = 0;
        this.speedX = 0;
        this.coordinateX = 1;
        this.coordinateY = 1;
        this.directionX = 0;
        this.directionY = 0;
    }

    public String speedUp(double acceleration){
        this.speedX += acceleration;
        this.speedY += acceleration;

        this.coordinateX += this.speedX;
        this.coordinateY += this.speedY;

        return  "[" + (double) Math.round(this.coordinateX * 100) / 100 +" , " + (double) Math.round(this.coordinateY * 100) / 100 + "]";
    }

    public void brake(){
        this.aceleration -= this.aceleration;
    }

    public void emergencyStop(){
        this.speedX = 0;
        this.speedY = 0;
        this.aceleration = 0;
    }

    public double getAceleration() {
        return this.aceleration;
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
