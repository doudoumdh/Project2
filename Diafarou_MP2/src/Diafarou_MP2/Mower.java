package Diafarou_MP2;

public abstract class Mower {
    //declare my variables
    private String manufacturer;
    private int year;
    private String serialNumber;

    //declare my default constructor
    public Mower(){
    }
    //declare my parameterized constructor
    public Mower(String manufacturer, int year, String serialNumber){
        this.manufacturer=manufacturer;
        this.year=year;
        this.serialNumber=serialNumber;
    }
    // setters
    public void setManufacturer(String manufacturer){
        this.manufacturer=manufacturer;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    //getters
    public String getManufacturer() {
        return manufacturer;
    }
    public int getYear() {
        return year;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    //Our toString method that will print out the result
    public String toString(){
        String x;
        x = "Mower manufacturer: " + manufacturer + "\nYear of manufacture: " +
                year + "\nSerial number of mower: " + serialNumber;
        return x;

    }
}
