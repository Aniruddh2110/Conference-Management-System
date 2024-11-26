import java.util.*;

public class Conferences {
    private List<Icon> icons = new ArrayList<>(); // Generics
    private List<Fire> fires = new ArrayList<>(); // Generics

    public void addIcon(Icon icon) {
        icons.add(icon);
        System.out.println("Icon details added successfully.");
    }

    public void addFire(Fire fire) {
        fires.add(fire);
        System.out.println("Fire details added successfully.");
    }

    public void displayIcon() {
        if (icons.isEmpty()) {
            System.out.println("No conferences available in the ICON.");
            return;
        }
        System.out.println("\n--- Icon List ---");
        for (Icon icon : icons) {
            icon.displayDetails();
            System.out.println("--------------------");
        }
    }

    public void displayFire() {
        if (fires.isEmpty()) {
            System.out.println("No conferences available in the FIRE.");
            return;
        }
        System.out.println("\n--- Fire List ---");
        for (Fire fire : fires) {
            fire.displayDetails();
            System.out.println("--------------------");
        }
    }

}
