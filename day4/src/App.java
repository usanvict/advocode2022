import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/victo/Desktop/advocode/day4/input.txt"));
        String line;
        Integer sum = 0;

        while ((line = reader.readLine()) != null) {
            String[] tokens1 = line.split(",");
            String[] tokens2 = tokens1[0].split("-");
            String[] tokens3 = tokens1[1].split("-");

            if ((Integer.parseInt(tokens2[1]) <= Integer.parseInt(tokens3[0])
                    && Integer.parseInt(tokens3[1]) <= Integer.parseInt(tokens2[0]))
                    ||
                    (Integer.parseInt(tokens2[1]) >= Integer.parseInt(tokens3[0])
                            && Integer.parseInt(tokens3[1]) >= Integer.parseInt(tokens2[0]))) {
                sum = sum + 1;
            }

        }
        reader.close();
        System.out.println(sum);
    }
}
