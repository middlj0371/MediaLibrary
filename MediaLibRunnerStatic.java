public class MediaLibRunnerStatic {
    public static void main(String[] args) { // 2.5.8 Step 1
        System.out.println(MediaLib.getOwner() + "'s Library");

        MediaLib.changeOwner("Owner"); // 2.5.8 Step 8
        System.out.println(MediaLib.getOwner() + "'s Library");

        MediaLib.owner = "New Owner"; // 2.5.8 Step 10
        System.out.println(MediaLib.owner + "'s Library");

        System.out.println(MediaLib.getNumEntries()); // 2.5.8 Step 14

        // 2.5.8 Step 16
        MediaLib staticLib1 = new MediaLib();
        Movie staticMovie1 = new Movie("Static Movie 1", 1.1);
        staticLib1.addMovie(staticMovie1);

        MediaLib staticLib2 = new MediaLib();
        Book staticBook1 = new Book("Static Book 1", "Static Author 1");
        staticLib2.addBook(staticBook1);

        System.out.println(staticLib1);
        System.out.println(staticLib2);

        System.out.println(MediaLib.getNumEntries()); // 2.5.8 Step 17


        // 2.5.8 Step 22
        Movie staticMovie2 = new Movie("Static Movie 2", 2.2);
        staticLib1.addMovie(staticMovie2);
        System.out.println(staticLib1);
        System.out.println(staticLib2);
        System.out.println(MediaLib.getNumEntries());

        Song song1 = new Song("Test Song");
        staticLib1.addSong(song1);
        System.out.println(song1);
        System.out.println(staticLib1);
        Song song2 = new Song("Test Song");
        System.out.println(song1.equals(song2));

        System.out.println(MediaLib.getNumEntries());
        System.out.println(MediaLib.getNumBooks());
        System.out.println(MediaLib.getNumMovies());
        System.out.println(MediaLib.getNumSongs());

    }
}
