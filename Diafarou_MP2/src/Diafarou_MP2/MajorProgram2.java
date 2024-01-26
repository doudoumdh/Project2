package Diafarou_MP2;
//We import our necessary packages
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class MajorProgram2 {
    public static void main(String[] args) {
        //we create a new arraylist "mowers" of type Mower that will be used to store our mowers
        //and array list "lines" that will be used to store every line we will read later
        int i;
        ArrayList<Mower> mowers = new ArrayList<>();
        ArrayList<String> lines = new ArrayList<>();

        // we create different objects for each class that we have
        MowerWareHouse newStore = new MowerWareHouse();
        Engine newEngine = new Engine();
        CommercialMower newCom = new CommercialMower();
        GasPoweredMower newGas = new GasPoweredMower();
        PushReelMower newPush = new PushReelMower();
        LawnTractor newLawn = new LawnTractor();
        WalkBehindMower newWalk = new WalkBehindMower() {
            @Override
            public void setCutWidth(double cutWidth) {
                super.setCutWidth(cutWidth);
            }

            @Override
            public void setWheelDiameter(double wheelDiameter) {
                super.setWheelDiameter(wheelDiameter);
            }
        };
        Mower newMower = new Mower() {
            @Override
            public void setManufacturer(String manufacturer) {
                super.setManufacturer(manufacturer);
            }

            @Override
            public void setYear(int year) {
                super.setYear(year);
            }

            @Override
            public void setSerialNumber(String serialNumber) {
                super.setSerialNumber(serialNumber);
            }

        };

        //We store our prompt text in a string variable to avoid retyping the same text everytime
        String phrase = "Type C for commercial Mower, G for gas Powered Mower," +
                " P for Push reel Mower, L for Lawn Tractor, and S to stop";

        //we use try-catch, bufferedReader and fileReader to read from our given file
        try (BufferedReader br = new BufferedReader(new FileReader("MP2.txt"))) {
            String line;
            //everytime our next line contains something we will add it in our previously created array list "lines"
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }

            //The program will print out an error message if an error occurred during the file opening or reading
        } catch (IOException e) {

            System.out.println("An error occurred");
        }
        //All our lines are stored in an arraylist called linesArray
        //The program asks the user what type of mower to show based on the four types
        String[] linesArray = lines.toArray(new String[0]);
        Scanner scnr = new Scanner(System.in);
        System.out.println(phrase);
        String choice = scnr.next();

        //if the user's choice is S, the program automatically exits
        if(choice.equals("S")){
            System.out.println("Exiting...");
            System.exit(0);
        }

        // and if the choice is different from S, the first line in our linesArray is assign to storeName
        // because we know that the file first line is the name of the store,
        //and we enter a for loop that will check for the specific letter that the user enters
        if (!choice.equals("S")) {
            newStore.setStoreName(linesArray[0]);
            System.out.println(newStore.toString());
            for (i = 0; i < lines.size(); ++i) {

            //We use a switch case to set and print the correct information based on the user's choice
                switch (choice) {
                    case "C" -> {

            //if the user enters "C" we set the previous 3 lines before the letter to name, manufacturer, and year
            //And we add all 3 to the array list mowers created because all types of mowers have those 3 info in common
                        if (linesArray[i].equals("C")) {
                            newMower.setManufacturer(linesArray[i - 3]);
                            newMower.setYear(Integer.parseInt(linesArray[i - 2]));
                            newMower.setSerialNumber(linesArray[i - 1]);
                            mowers.add(newMower);
            //based on the type of mower engine we set the characteristics of each mower
            //different from each one
                            newEngine.setManufacturer(linesArray[i+1]);
                            newEngine.setHorsePower(Double.parseDouble(linesArray[i+2]));
                            newEngine.setCylinders(Integer.parseInt(linesArray[i+3]));
                            newLawn.setModel(linesArray[i+4]);
                            newLawn.setDeckWidth(Double.parseDouble(linesArray[i+5]));
                            newCom.setOperatingHours(Double.parseDouble(linesArray[i +6]));
                            newCom.setZeroTurnRadius(Boolean.parseBoolean(linesArray[i +7]));

            // we print all the information by calling the specific methods
            //and ask the user if he wants to search again or quit
                            //System.out.println(mowers);
                            System.out.println(newMower.toString());
                            System.out.println("Mower Engine: "+ linesArray[i]);
                            System.out.println(newEngine.toString());
                            System.out.println(newLawn.toString());
                            System.out.println(newCom.toString());

                            System.out.println(phrase);
                            choice = scnr.next();
                        }
                    }
                    case "L" -> {
            //if the user enters "L" we set the previous 3 lines before the letter to name, manufacturer, and year
            //And we add all 3 to the array list mowers created because all types of mowers have those 3 info in common
                        if (linesArray[i].equals("L")) {
                            newMower.setManufacturer(linesArray[i - 3]);
                            newMower.setYear(Integer.parseInt(linesArray[i - 2]));
                            newMower.setSerialNumber(linesArray[i - 1]);
                            mowers.add(newMower);
            //based on the type of mower engine we set the characteristics of each mower
            //different from each one
                            newEngine.setManufacturer(linesArray[i+1]);
                            newEngine.setHorsePower(Double.parseDouble(linesArray[i+2]));
                            newEngine.setCylinders(Integer.parseInt(linesArray[i+3]));
                            newLawn.setModel(linesArray[i+4]);
                            newLawn.setDeckWidth(Double.parseDouble(linesArray[i+5]));
            // we print all the information by calling the specific methods
            //and ask the user if he wants to search again or quit
                            //System.out.println(mowers);
                            System.out.println(newMower.toString());
                            System.out.println("Mower Engine: "+ linesArray[i]);
                            System.out.println(newEngine.toString());
                            System.out.println(newLawn.toString());
                            System.out.println(phrase);
                            choice = scnr.next();
                        }
                    }
                    case "P" -> {

            //if the user enters "P" we set the previous 3 lines before the letter to name, manufacturer, and year
            //And we add all 3 to the array list mowers created because all types of mowers have those 3 info in common
                        if (linesArray[i].equals("P")) {
                            newMower.setManufacturer(linesArray[i - 3]);
                            newMower.setYear(Integer.parseInt(linesArray[i - 2]));
                            newMower.setSerialNumber(linesArray[i - 1]);
                            mowers.add(newMower);

            //based on the type of mower engine we set the characteristics of each mower
            //different from each one
                            newWalk.setCutWidth(Double.parseDouble(linesArray[i+1]));
                            newWalk.setWheelDiameter(Double.parseDouble(linesArray[i+2]));
                            newPush.setNumWheels(Integer.parseInt(linesArray[i+3]));

            // we print all the information by calling the specific methods
            //and ask the user if he wants to search again or quit
                            //System.out.println(mowers);
                            System.out.println(newMower.toString());
                            System.out.println("Mower Engine: "+ linesArray[i]);
                            System.out.println(newWalk.toString());
                            System.out.println(newPush.toString());

            // we print all the information by calling the specific methods
            //and ask the user if he wants to search again or quit
                            System.out.println(phrase);
                            choice = scnr.next();

                        }
                    }
                    case "G" -> {

            //if the user enters "G" we set the previous 3 lines before the letter to name, manufacturer, and year
            //And we add all 3 to the array list mowers created because all types of mowers have those 3 info in common
                        if (linesArray[i].equals("G")) {
                            newMower.setManufacturer(linesArray[i - 3]);
                            newMower.setYear(Integer.parseInt(linesArray[i - 2]));
                            newMower.setSerialNumber(linesArray[i - 1]);
                            mowers.add(newMower);

            //based on the type of mower engine we set the characteristics of each mower
            //different from each one
                            newWalk.setCutWidth(Double.parseDouble(linesArray[i+1]));
                            newWalk.setWheelDiameter(Double.parseDouble(linesArray[i+2]));
                            newEngine.setManufacturer(linesArray[i+3]);
                            newEngine.setHorsePower(Double.parseDouble(linesArray[i+4]));
                            newEngine.setCylinders(Integer.parseInt(linesArray[i+5]));
                            newGas.setSelfPropelled(Boolean.parseBoolean(linesArray[i+6]));

            // we print all the information by calling the specific methods
            //and ask the user if he wants to search again or quit
                            //System.out.println(mowers);
                            System.out.println(newMower.toString());
                            System.out.println("Mower Engine: "+ linesArray[i]);
                            System.out.println(newWalk);
                            System.out.println(newEngine.toString());
                            System.out.println(newGas.toString());
                            System.out.println(phrase);
                            choice = scnr.next();

                        }
                    }

                }

            }
        }

        //we print out a message that tells the user their choice is invalid if different from S,C,L,P or G
        if(!choice.equals("C") || !choice.equals("L") || !choice.equals("G") || !choice.equals("P")) {
            System.out.println("Invalid choice!!!");
        }

    }
}
