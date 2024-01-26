package Diafarou_MP2;

public class GasPoweredMower extends WalkBehindMower{
    private Engine engine;
    private boolean selfPropelled;

    public GasPoweredMower(){
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setSelfPropelled(boolean selfPropelled) {
        this.selfPropelled = selfPropelled;
    }

    public Engine getEngine() {
        return engine;
    }

    public boolean isSelfPropelled() {
        return selfPropelled;
    }
    public String toString(){
        String x;
        x = "Mower engine: " + engine + "\nIs the mower self-propelled: " + selfPropelled;
        return x;
    }
}
