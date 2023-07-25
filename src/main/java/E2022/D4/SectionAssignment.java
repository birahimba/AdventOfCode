package E2022.D4;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class SectionAssignment {
    int start;
    int end;

    /**
     * Verifie si une plage de section contien entierement une autre plage de section
     * @param sectionAssignment section
     * @return true si le debut de la plage 'this' contient entierement le debut de la deuxieme
     */
    public boolean fullyContains(SectionAssignment sectionAssignment) {
        return this.start <= sectionAssignment.start && this.end >= sectionAssignment.end;
    }

    /**
     * Verifie s'il y a chauvauchement
     * @param sectionAssignment section
     * @return true si au moins une section est commune entre les deux plages
     */
    public boolean overlaps(SectionAssignment sectionAssignment) {
        return this.start <= sectionAssignment.end && sectionAssignment.start <= this.end;
    }

}
