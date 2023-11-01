import java.io.IOException;
import java.util.ArrayList;

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
    }
}