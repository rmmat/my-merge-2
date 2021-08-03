package orchestra.section;

import java.util.ArrayList;
import java.util.List;

public abstract class Section {
    private String name;
    private List<String> instruments;

    public Section(String name) {
        this.name = name;
        this.instruments = new ArrayList<>();
    }

    protected void addInsrument(String instrument) {
        this.instruments.add(instrument);
    }

    public void print() {
        System.out.println(this.name + ":");
        System.out.println('\t' + String.join(", ", this.instruments));
    }
}
