package E2022.D4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String inputFile = "src/main/java/E2022/D4/input.txt";
        int countFullyContains = 0;
        int countOverlaps = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] assignments = line.split(",");
                SectionAssignment assignment1 = parseSectionAssignment(assignments[0]);
                SectionAssignment assignment2 = parseSectionAssignment(assignments[1]);

                // Exo 1:  Nombre de paires d'affectation où l'une contient entièrement l'autre
                if (assignment1.fullyContains(assignment2) || assignment2.fullyContains(assignment1)) {
                    countFullyContains++;
                }

                // Exo 2:  compter le nombre de paires d'affectation avec des sections se chevauchant
                if (assignment1.overlaps(assignment2) || assignment2.overlaps(assignment1)) {
                    countOverlaps++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Nombre de paires d'affectation où l'une contient entièrement l'autre : " + countFullyContains);
        System.out.println("Nombre de paires d'affectation avec des sections qui se chevauchent : " + countOverlaps);
    }


    /**
     *  Parsing et conversion
     * @param assignmentString une paire daffecttation
     * @return un nouvel obejet SectionAssignement avec les valeurs
     */
    private static SectionAssignment parseSectionAssignment(String assignmentString) {
        String[] sections = assignmentString.split("-");
        int start = Integer.parseInt(sections[0]);
        int end = Integer.parseInt(sections[1]);
        return new SectionAssignment(start, end);
    }
}
