public class Fire {
    private String tutorial_fire;
    private String workshop_fire;
    private String paper_presentationFire;
    private String poster_presentationFire;
    private String timeFire;

    // Constructor
    public Fire( String tutorial_fire, String workshop_fire, String paper_presentationFire, String poster_presentationFire, String timeFire) {
        this.tutorial_fire = tutorial_fire;
        this.workshop_fire = workshop_fire;
        this.paper_presentationFire = paper_presentationFire;
        this.poster_presentationFire = poster_presentationFire;
        this.timeFire = timeFire;
    }

    // Getters and setters

    public String getTutorial_fire() {
        return tutorial_fire;
    }

    public String getWorkshop_fire() {
        return workshop_fire;
    }

    public String getPaper_presentationFire() {
        return paper_presentationFire;
    }

    public String getPoster_presentationFire() {
        return poster_presentationFire;
    }

    public String getTimefire() {
        return timeFire;
    }


    public void displayDetails() {
        System.out.println("Tutorials time in FIRE conference : " + tutorial_fire);
        System.out.println("Workshops time in FIRE conference : " + workshop_fire);
        System.out.println("Paper Presentation time in FIRE conference : " + paper_presentationFire);
        System.out.println("Poster Presentation time in FIRE conference : " + poster_presentationFire);
        System.out.println("Break Time : " + timeFire);
    }
}
