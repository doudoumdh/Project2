package Diafarou_MP2;

public class Engine {
    //declare our variables
    private String manufacturer;
    private double horsePower;
    private int cylinders;

    //default constructor
    public Engine(){
    }
    //parameterized constructor
    public Engine(String manufacturer, double horsePower, int cylinders){
        this.manufacturer=manufacturer;
        this.horsePower=horsePower;
        this.cylinders=cylinders;
    }
    //setters
    public void setManufacturer(String manufacturer){
        this.manufacturer=manufacturer;
    }
    public void setHorsePower(double horsePower){
        this.horsePower=horsePower;
    }
    public void setCylinders(int cylinders){
        this.cylinders=cylinders;
    }
    //getters
    public String getManufacturer(){
        return manufacturer;
    }
    public double getHorsePower(){
        return horsePower;
    }
    public int getCylinders(){
        return cylinders;
    }
    //Our toString method that will print out the result
    public String toString(){
        String x = "Engine manufacturer: " + manufacturer + "\nHorse power of engine: " +
                horsePower + "\nNumber of cylinders: " + cylinders;
        return x;
    }
}
