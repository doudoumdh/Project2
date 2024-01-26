package Diafarou_MP2;

public abstract class WalkBehindMower extends Mower {
    private double cutWidth;
    private double wheelDiameter;

    public WalkBehindMower(){
    }

    public void setCutWidth(double cutWidth) {
        this.cutWidth = cutWidth;
    }

    public void setWheelDiameter(double wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public double getCutWidth() {
        return cutWidth;
    }

    public double getWheelDiameter() {
        return wheelDiameter;
    }
    public String toString(){
        String x;
        x = "Blade width of mower: " + cutWidth + "\nDiameter of the mower wheels: " + wheelDiameter;
        return x;
    }
}
