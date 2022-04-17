import java.util.ArrayList;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class Biography {
  public static void main(String[] args) {
    /**
     * WORK ON BOOK AND AUTHOR CLASSES FIRST
     This will be our actual program that we define author and his books
     In this program we will write the biography of Stefan Zweig, an Austrian novelist.

     Write a program that will get information from user and
     -Print information for the favorite author
     -Print information of the books of favorite author

     Full name = Stefan Zweig
     County = Austria
     Is still alive: No (28 November 1881 – 22 February 1942)
     Some of his books as listed below:

     BookName                            Genre           TotalPage
     Amok                                tale            189
     The Royal Game                      novella         53
     24 Hours in the Life of a Woman     novella         80
     */
        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', tale='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', tale='novella', page=80}
         */
    //YOUR CODE HERE
    boolean isAuthorAlive = false;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> listAuthor = new ArrayList<>();
    System.out.println("Please write your favorite author name");
    String firstName = scanner.nextLine();
    System.out.println("Please write your favorite author last name");
    String lastName = scanner.nextLine();
    System.out.println("Please write from what country is your favorite author");
    String countryFrom = scanner.nextLine();
    System.out.println("Is your favorite author still alive? (Y/N)");
    String isAlive = scanner.nextLine();
    int age = 0;
    if (isAlive.toLowerCase().startsWith("y")) {
      isAuthorAlive = true;
      System.out.println("How old is your favorite author?");
     age = scanner.nextInt();
    }
    String favBooks;
     do{
       System.out.println("Would you like enter book information? (Y/N)");
       favBooks = scanner.nextLine();
       if(favBooks.toLowerCase().startsWith("y")){
         System.out.println("Please enter your authors favorite book");
       String name = scanner.nextLine();
       System.out.println("Please enter your favorite book genre");
       String genre = scanner.nextLine();

       System.out.println("Please how many pages the book has");
       int totalPages = scanner.nextInt();

     Book bookList = new Book(name, genre, totalPages);
     listAuthor.add(bookList);
     }

     }while(favBooks.toLowerCase().startsWith("y"));
    System.out.println(new Author(firstName, lastName, countryFrom, isAuthorAlive, age , listAuthor));
   System.out.println("Author's books are as listed below: ");
    for (Book book : listAuthor) {
     System.out.println(book);
    }


  }

}