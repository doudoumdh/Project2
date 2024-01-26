package Diafarou_MP2;

import java.util.ArrayList;

public class MowerWareHouse{
    private String storeName;
    private ArrayList<Mower> mowers;

    public MowerWareHouse(){
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setMowers(ArrayList<Mower> mowers) {
        this.mowers = mowers;
    }

    public String getStoreName() {
        return storeName;
    }

    public ArrayList<Mower> getMowers() {
        return mowers;
    }

    public void readMowerData(String inputFileName){

    }
    public void saveMowerData(String outputFilename){

    }
    public String toString(){
        String x;
        x = "Name of the mower Store: "+ storeName;
        return x;
    }
}
