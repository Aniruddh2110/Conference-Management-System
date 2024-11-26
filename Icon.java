public class Icon {
    private String tutorials; 
    private String workshop;
    private String paper_presentation;
    private String poster_presentation;
    private String time;

    // Constructor
    public Icon( String tutorials, String workshop, String paper_presentation, String poster_presentation, String time) {
       
        this.tutorials = tutorials;
        this.workshop = workshop;
        this.paper_presentation = paper_presentation;
        this.poster_presentation = poster_presentation;
        this.time = time;
    }


    // Getters and setters

    public String getTutorials() {
        return tutorials;
    }

    public String getWorkshop() {
        return workshop;
    }

    public String getPaper_presentation() {
        return paper_presentation;
    }

    public String getPoster_presentation() {
        return poster_presentation;
    }

    public String   getTime() {
        return time;
    }

    public void displayDetails() {
        System.out.println("Tutorials time in ICON conference : " + tutorials);
        System.out.println("Workshop time in ICON conference : " + workshop);
        System.out.println("Paper Presentation time in ICON conference : " + paper_presentation);
        System.out.println("Poster Presentation time in ICON conference : " + poster_presentation);
        System.out.println("Break Time : " + time);
    }
}
