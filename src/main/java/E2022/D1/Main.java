package E2022.D1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String input = "src/main/java/E2022/D1/input.txt";
        List<Integer> result = new ArrayList<>();
        int count = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(input))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    count += Integer.parseInt(line);
                } else {
                    result.add(count);
                    count = 0;
                }
            }
            result.add(count); // Ajouter la dernière valeur de "count" à la liste "result".
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Trouver la valeur maximale dans la liste "result" et l'afficher.
        int max = Collections.max(result);
        System.out.println(max);
    }
}
