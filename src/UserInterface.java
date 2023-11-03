import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserInterface {
    private FileHandler fileHandler = new FileHandler();
    private ArrayList<Covid19Data> covid19DataList;

    public void start() {
        try {
            covid19DataList = fileHandler.restoreData();
            processCommand();
        } catch (IOException e) {
            displayErrorMessage();
        }
    }
    public void processCommand() {

        boolean programRunning = true;


        do {
            System.out.println("Vil du sortere efter aldersgruppe eller region (q to quit)?");
            Scanner keyboard = new Scanner(System.in);
            String userChoice = keyboard.nextLine().toLowerCase();
            switch (userChoice) {
                case "region", "r" -> displayByRegion();
                case "aldergsgruppe", "a" -> displayByAldersgruppe();
                case "q", "Q" -> programRunning = false;
            }
        }
        while (programRunning);
    }

    private void displayByRegion() {
        Collections.sort(covid19DataList, new RegionComparator());
        for (Covid19Data covid19Data : covid19DataList) {
            System.out.println(covid19Data);
        }
    }

    private void displayByAldersgruppe() {
        Collections.sort(covid19DataList, new AldersGruppeComparator());
        for (Covid19Data covid19DataList1 : covid19DataList) {
            System.out.println(covid19DataList1);
        }
    }

    private void displayErrorMessage() {
        System.out.println("Error reading file");
    }
}


