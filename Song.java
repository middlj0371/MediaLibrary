public class Song {
    private String title;
    private int rating;

    public Song(String t) {
        title = t;
        rating = 0;
    }

    public String getTitle() {
        return this.title;
    }

    public int getRating() {
        return this.rating;
    }

    public String toString() {
        String info = "\"" + title + "\"";
        if (rating != 0) 
        { 
        info += ", rating is " + rating;
        }
        return info;
    }

    public void setTitle(String t) {
        title = t;
    }
    
    public void adjustRating(int r) {
        if((rating + r <= 10) && (rating + r >= 0)) {
            rating += r;
        }
        
    }
    
    public boolean equals(Song s) {
        return s.title.equals(this.title);
    }
}
