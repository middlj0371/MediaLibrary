/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  public static String owner = "PLTW"; // 2.5.8 Step 5
  private static int numEntries = 0; // 2.5.8 Step 12
  private Song song;
  private static int numBooks = 0;
  private static int numMovies = 0;
  private static int numSongs = 0;

  public void addBook(Book b)
  {
    if(this.book == null) { // 2.5.8 Step 23
      book = b;
      numEntries++; // 2.5.8 Step 15
      numBooks++;
    } else {
      System.out.println("Error: The selected Media Library already contains a book"); // 2.5.8 Step 24
    }
    
  }

  public String toString() 
  {
    String info = "";
    if(book != null) { // Step 5
      info += book; // Step 5
    }
    if(movie != null) {
      info += "\n" + movie;
    }
    if(song != null) {
      info += "\n" + song;
    }
    return info;
  }

  // public void testBook(Book tester) { // Step 18
  //   tester.setTitle("Animal Farm"); // Step 19
  //   System.out.println(tester.getTitle());
  // }

  public void addMovie(Movie m) {
    if(this.movie == null) { // 2.5.8 Step 23
      movie = m;
      numEntries++; // 2.5.8 Step 15
      numMovies++;
    } else {
      System.out.println("Error: The selected Media Library already contains a movie"); // 2.5.8 Step 24
    }
    
  }

  public static String getOwner() { // 2.5.8 Step 2
    return owner; // 2.5.8 Step 6
  }

  public static void changeOwner(String o) { // 2.5.8 Step 7
    owner = o;
  }

  public static int getNumEntries() { // 2.5.8 Step 13
    return numEntries;
  }

  // 2.5.8 Step 25
  public void changeBook(Book b) {
    book = b;
  }
  // 2.5.8 Step 25
  public void changeMovie(Movie m) {
    movie = m;
  }

  public void addSong(Song s) {
    if(this.song == null) {
      song = s;
      numEntries++;
      numSongs++;
    } else {
      System.out.println("Error: The selected Media Library already contains a song");
    }
  }

  public static int getNumBooks() {
    return numBooks;
  }

  public static int getNumMovies() {
    return numMovies;
  }

  public static int getNumSongs() {
    return numSongs;
  }
}