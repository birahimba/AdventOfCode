package E2022.D4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String inputFile = "src/main/java/E2022/D4/input.txt";
        int countFullyContains = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] assignments = line.split(",");
                SectionAssignment assignment1 = parseSectionAssignment(assignments[0]);
                SectionAssignment assignment2 = parseSectionAssignment(assignments[1]);

                if (assignment1.fullyContains(assignment2) || assignment2.fullyContains(assignment1)) {
                    countFullyContains++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Nombre de paires d'affectation où l'une contient entièrement l'autre : " + countFullyContains);
    }

    private static SectionAssignment parseSectionAssignment(String assignmentString) {
        String[] sections = assignmentString.split("-");
        int start = Integer.parseInt(sections[0]);
        int end = Integer.parseInt(sections[1]);
        return new SectionAssignment(start, end);
    }
}
