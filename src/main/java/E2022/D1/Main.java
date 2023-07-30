package E2022.D1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String input = "src/main/java/E2022/D1/input.txt";
        List<Integer> result = new ArrayList<>();
        int count = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(input))) {
            String lines;
            while ((lines = bufferedReader.readLine()) != null) {
                if (!lines.isEmpty()) {
                    count = count + Integer.parseInt(lines);
                } else {
                    result.add(count);
                    count = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result.stream().max(Integer::compareTo));
    }
}
