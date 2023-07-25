package E2022.D4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SectionAssignment {
    int start;
    int end;

    public boolean fullyContains(SectionAssignment other) {
        return this.start <= other.start && this.end >= other.end;
    }
}
