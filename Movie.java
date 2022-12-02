public class Movie {
    private String title;
    private double duration;
    private int rating;

    // Constructor
    public Movie(String t, double d) {
        title = t;
        duration = d;
        rating = 0;
    }

    // Accessors
    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public int getRating() {
        return rating;
    }

    public String toString() {
        String info = "\"" + title + "\", " + duration + " hours long";
        if (rating != 0) { 
            info += ", rating is " + rating;
        }
        return info;
    }

    // Mutators
    public void setTitle(String t) {
        title = t;
    }

    public void setDuration(double d) {
        duration = d;
    }

    public void adjustRating(int r) {
        if((rating + r <= 10) && (rating + r >= 0)) {
        rating += r;
        }
        
    }

    public boolean equals(Movie m) {
        return m.title.equals(this.title) && m.duration == this.duration;
    }


}
