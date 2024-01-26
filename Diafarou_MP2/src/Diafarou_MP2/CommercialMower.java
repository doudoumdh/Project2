package Diafarou_MP2;

public class CommercialMower extends LawnTractor{
    private double operatingHours;
    private boolean zeroTurnRadius;

    public CommercialMower(){
    }

    public void setOperatingHours(double operatingHours) {
        this.operatingHours = operatingHours;
    }

    public void setZeroTurnRadius(boolean zeroTurnRadius) {
        this.zeroTurnRadius = zeroTurnRadius;
    }

    public double getOperatingHours() {
        return operatingHours;
    }

    public boolean isZeroTurnRadius() {
        return zeroTurnRadius;
    }
    public String toString(){
        String x;
        x= "Operating hours: " + operatingHours + "\nIs turn radius zero: " + zeroTurnRadius;
        return x;
    }
}
