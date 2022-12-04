import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> allSums = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/victo/Desktop/advocode/day1/input.txt"));
        String line;
        ArrayList<Integer> topKList = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        while ((line = reader.readLine()) != null) {
            if (!line.trim().isEmpty()) {
                Integer i = Integer.parseInt(line);
                temp.add(i);
                // System.out.println(temp);
            } else {
                Integer sum = 0; // initialize sum
                int k;
                for (k = 0; k < temp.size(); k++) {
                    sum += temp.get(k);
                }

                allSums.add(sum);
                temp = new ArrayList<Integer>();
            }
        }

        for (int i = 0; i < 3; i++) {
            int maxIndex = 0;

            for (int j = 1; j < allSums.size(); j++) {
                if (allSums.get(j) > allSums.get(maxIndex)) {
                    maxIndex = j;
                }
            }

            topKList.add(allSums.remove(maxIndex));
        }

        Integer sum2 = 0; // initialize sum
        int k;
        for (k = 0; k < topKList.size(); k++) {
            sum2 += topKList.get(k);
        }

        System.out.println("Maximum Element in ArrayList = "
                + sum2);
    }
}
