import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/victo/Desktop/advocode/day3/input.txt"));
        String line;
        Integer sum = 0;

        String alphabet2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] alphabet = alphabet2.split("");

        while ((line = reader.readLine()) != null) {
            String[] tokens1 = line.split("");
            String[] tokens2 = (reader.readLine()).split("");
            String[] tokens3 = (reader.readLine()).split("");
            ArrayList<String> list1 = new ArrayList<>();
            ArrayList<String> list2 = new ArrayList<>();
            ArrayList<String> list3 = new ArrayList<>();
            for (int l = 0; l < tokens1.length; l++) {
                list1.add(tokens1[l]);
            }
            for (int m = 0; m < tokens2.length; m++) {
                list2.add(tokens2[m]);
            }
            for (int m = 0; m < tokens3.length; m++) {
                list3.add(tokens3[m]);
            }

            list1.retainAll(list2);
            list1.retainAll(list3);

            for (int j = 0; j < 52; j++) {
                if (list1.get(0).equals(alphabet[j])) {
                    sum = sum + j + 1;
                }
            }
        }
        reader.close();
        System.out.println(sum);
    }
}
