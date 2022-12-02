public class MediaLibRunnerScope {
    public static void main(String[] args) {
        MediaLib myLib = new MediaLib();
        myLib.addMovie(new Movie("Raiders of the Lost Ark", 1.9));
        myLib.addBook(new Book("1984", "Orwell"));
        myLib.addSong(new Song("In Your Eyes"));
        System.out.println(MediaLib.getOwner() + "'s Library:\n" + myLib);

        Book scopeBook = new Book("Test Book 1", "Test Author 1");
        scopeBook.adjustRating(1);
        scopeBook.adjustRating(3);
    }
}