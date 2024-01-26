package Diafarou_MP2;

public class LawnTractor extends Mower{
    //declare our variables
    private Engine engine;
    private String model;
    private double deckWidth;

    //our default constructor
    public LawnTractor(){
    }

    //setters
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setDeckWidth(double deckWidth) {
        this.deckWidth = deckWidth;
    }

    //getters
    public Engine getEngine(){
        return engine;
    }
    public String getModel(){
        return model;
    }
    public double getDeckWidth(){
        return deckWidth;
    }

    //printing out method
    public String toString(){
        String x = "Model of lawn tractor: " +
                model + "\nWidth of mower deck: " + deckWidth;
        return x;
    }
}
