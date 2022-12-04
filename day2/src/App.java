import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/victo/Desktop/advocode/day2/input.txt"));
        String line;
        Integer sum = 0;

        while ((line = reader.readLine()) != null) {
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
                case "A":
                    if (tokens[1].equals("X")) {
                        sum = sum + 3;
                    } else if (tokens[1].equals("Y")) {
                        sum = sum + 3 + 1;
                    } else {
                        sum = sum + 6 + 2;
                    }
                    break;
                case "B":
                    if (tokens[1].equals("X")) {
                        sum = sum + 1;
                    } else if (tokens[1].equals("Y")) {
                        sum = sum + 3 + 2;
                    } else {
                        sum = sum + 6 + 3;
                    }
                    break;
                case "C":
                    if (tokens[1].equals("X")) {
                        sum = sum + 2;
                    } else if (tokens[1].equals("Y")) {
                        sum = sum + 3 + 3;
                    } else {
                        sum = sum + 6 + 1;
                    }
            }

        }

        System.out.println(sum);
    }
}
