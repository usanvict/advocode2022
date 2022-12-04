import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {

    static int solveFirstPart(String[] lines) throws NumberFormatException, IOException {
        Integer sum = 0;

        for (var line : lines) {
            String[] tokens = line.split(",|\\-");
            if ((Integer.parseInt(tokens[0]) <= Integer.parseInt(tokens[2])
                    && Integer.parseInt(tokens[1]) >= Integer.parseInt(tokens[3]))
                    ||
                    (Integer.parseInt(tokens[0]) >= Integer.parseInt(tokens[2])
                            && Integer.parseInt(tokens[1]) <= Integer.parseInt(tokens[3]))) {
                sum = sum + 1;
            }
        }

        return sum;
    }

    static int solveSecondPart(String[] lines) throws NumberFormatException, IOException {
        Integer sum = 0;

        for (String line : lines) {
            String[] tokens = line.split(",|\\-");
            if ((Integer.parseInt(tokens[1]) <= Integer.parseInt(tokens[2])
                    && Integer.parseInt(tokens[3]) <= Integer.parseInt(tokens[0]))
                    ||
                    (Integer.parseInt(tokens[1]) >= Integer.parseInt(tokens[2])
                            && Integer.parseInt(tokens[3]) >= Integer.parseInt(tokens[0]))) {
                sum = sum + 1;
            }
        }

        return sum;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader("./day4/input.txt"));
        String[] lines = reader.lines().toArray(String[]::new);
        System.out.println(solveFirstPart(lines));
        System.out.println(solveSecondPart(lines));

        reader.close();

    }
}
