import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FileHandler {
    private final File covidData;

    public FileHandler(){
        covidData = new File("11_noegletal_pr_region_pr_aldersgruppe.csv");
    }

    ArrayList<Covid19Data> dataSet = new ArrayList<>();
    public ArrayList<Covid19Data> getDataSet () {
        return dataSet;
    }
    public ArrayList<Covid19Data> restoreData() throws IOException {

            Scanner sc = new Scanner(covidData, StandardCharsets.ISO_8859_1);

        sc.nextLine();

        while(sc.hasNext()){
            String line = sc.nextLine();

            String[] attributes = line.split(";");

            Covid19Data covid19Data = new Covid19Data(attributes[0], attributes[1], attributes[2], attributes[3], attributes[4], attributes[5], attributes[6]);

            dataSet.add(covid19Data);
        }

            sc.close();
            return dataSet;
        }


    }



