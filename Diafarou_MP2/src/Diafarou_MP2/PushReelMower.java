package Diafarou_MP2;
public class PushReelMower extends WalkBehindMower{
    private int numWheels;

    public PushReelMower(){
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getNumWheels() {
        return numWheels;
    }
    public String toString(){
        String x;
        x= "Number of wheels on the mower: " + numWheels;
        return x;
    }
}
