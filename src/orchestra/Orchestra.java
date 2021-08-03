package orchestra;

import orchestra.section.Keyboard;
import orchestra.section.Percussion;
import orchestra.section.Section;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {
    private List<Section> sections;

    private Orchestra() {
        this.sections = new ArrayList<>();
        this.sections.add(new Keyboard());
        this.sections.add(new Percussion());
    }

    private void print() {
        System.out.println("===== Orchestra Members =====");
        System.out.println("Conductor");
        this.sections.forEach(section -> section.print());
    }

    public static void main(String[] aregs) {
        Orchestra orchestra = new Orchestra();

        orchestra.print();
    }
}
