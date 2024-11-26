// Author = Aniruddh Abhisheki
// Seat No = 24P0320007
// Date = 26/11/20241

import java.util.Scanner;

public class ConferencesManagementSystem {
    public static void main(String[] args) {
        Conferences conferences = new Conferences();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Conference Management System ---");
            System.out.println("\n--- Icon Conference dates 14-15-16-17 Dec 2024  ---");
            System.out.println("1. Add ICON details ");
            System.out.println("2. Display Icon details ");
            System.out.println("\n--- Fire Conference dates 15-16-17-18 Dec 2024  ---");
            System.out.println("3. Add FIRE details ");
            System.out.println("4. Display Fire details ");
            System.out.println("\n 5. Exit");
            System.out.print("\n Enter your choice : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Exception handling
            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Tutorials Timing : ");
                        String tutorials = scanner.nextLine();
                        System.out.print("Enter Workshops Timing : ");
                        String workshop = scanner.nextLine();
                        System.out.print("Enter Paper Presentation Timing  : ");
                        String paper_presentation = scanner.nextLine();
                        System.out.print("Enter Poster Presentation Timing : ");
                        String poster_presentation = scanner.nextLine();
                        System.out.print("Break Time : ");
                        String time = scanner.nextLine();
                        conferences.addIcon(new Icon(tutorials, workshop, paper_presentation, poster_presentation, time));
                    }
                    case 2 -> {
                        System.out.print("Enter Tutorials Timing : ");
                        String tutorial_fire = scanner.nextLine();
                        System.out.print("Enter Workshops Timing : ");
                        String workshop_fire = scanner.nextLine();
                        System.out.print("Enter Paper Presentation Timing : ");
                        String paper_presentationFire = scanner.nextLine();
                        System.out.print("Enter Poster Presentation Timing : ");
                        String poster_presentationFire = scanner.nextLine();
                        System.out.print("Break Time : ");
                        String timeFire = scanner.nextLine();
                        conferences.addFire(new Fire(tutorial_fire, workshop_fire, paper_presentationFire, poster_presentationFire, timeFire));
                    }
                    case 3 -> conferences.displayIcon();
                    case 4 -> conferences.displayFire();
                    case 5 -> {
                        System.out.println("Exiting... Goodbye!");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
