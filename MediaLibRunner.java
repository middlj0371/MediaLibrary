/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();

    Book myBook = new Book("The Lord of the Rings", "Tolkien"); // Step 2
    System.out.println("Book created: " + myBook); // Step 3

    System.out.println("Library:\n" + myLib); // Step 6
    myLib.addBook(myBook); // Step 4
    System.out.println("Library:\n" + myLib); // Step 6

    int myRating = 5; // Step 8
    myBook.adjustRating(myRating);
    System.out.println(myBook);

    myRating = 10; // Step 9
    System.out.println(myBook);

    myBook.adjustRating(myRating); // Step 10
    System.out.println(myBook);

    myBook.setTitle("Rings"); // Step 12
    System.out.println("Book:" + myBook); // Step 13
    System.out.println("Library: " + myLib);

    myBook.setAuthor("Test"); // Step 14
    System.out.println("Book:" + myBook);
    System.out.println("Library: " + myLib);


    // Step 15
    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();

    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");
    System.out.println(myLib2);


    // Step 20
    // System.out.println("before test:" + newBook);
    // myLib.testBook(newBook);
    // System.out.println("after test:" + newBook);


    // Step 25
    Book newBook2 = new Book("1984", "Orwell");
    System.out.println(newBook.equals(newBook2));

    // Step 27
    // System.out.println(newBook2.title);  <- Error, Book.title is private 

    Movie newMovie = new Movie("A movie", 1.1);
    myLib.addMovie(newMovie);
    System.out.println(myLib);
    System.out.println(newMovie);
    Movie newMovie2 = new Movie("A movie", 1.1);
    System.out.println(newMovie.equals(newMovie2));
  }
}