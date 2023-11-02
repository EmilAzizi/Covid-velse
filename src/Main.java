import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        FileHandler f = new FileHandler();

        try {
            ArrayList<Covid19Data> data1 = f.restoreData();

            for (Covid19Data data : data1) {
                System.out.println(data.toString());
            }
        } catch (IOException e){
            e.getMessage();
        }

        Collections.sort(covid19Data, new AldersGruppeComparator());
        for (Covid19Data covid19DataList1 : covid19Data)
            System.out.println(covid19DataList1);


        Collections.sort( covid19Data,new RegionComparator());
        System.out.println();
        for (Covid19Data covid19DataList2: covid19Data) {
            System.out.println(covid19DataList2);
        }
    }
}