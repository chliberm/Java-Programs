/**
   Celia Liberman
   CS 110
   The Book class. Documents a book's isbn, title, author,
   publisher, and number of pages.
*/


public class Book
{
   // Create the fields.
   private String isbn;  // The book's isbn.
   private String title;  // The book's title.
   private Author author;  // The book's author.
   private String publisher;  // The book's publisher.
   private int numPages;  // The number of pages in the book
   
   /**
      The constructor sets all of the book's fields to the 
      corresponding given value.
      @param isbnStr The book's isbn
      @param bookTitle The book's title
      @param auth The book's author
      @param pub The book's publisher
      @param pages The number of pages 
   */
   
   public Book(String isbnStr, String bookTitle, Author auth,
               String pub, int pages)
   {
      isbn = isbnStr;
      title = bookTitle;
      author = auth;
      publisher = pub;
      numPages = pages;
   }
   
   
   /**
      The copy constructor accept a book object as an 
      argument from which the fields values will be coppied
      to the book object being created.
      @param bookObject The book object whose content we
                        want to copy. 
   */
   
   public Book(Book bookObject)
   {
      isbn = bookObject.isbn;
      title = bookObject.title;
      author = bookObject.author;
      publisher = bookObject.publisher;
      numPages = bookObject.numPages;
   }
   
   
   /**
      The getISBN method returns the book's isbn.
      @return isbn The book's isbn. 
   */
   
   public String getISBN()
   {
      return isbn;
   }
   
   
   /**
      The setISBN method sets the book's isbn to the given
      string.
      @param isbnStr The book's isbn.
   */
   
   public void setISBN(String isbnStr)
   {
      isbn = isbnStr;
   }
   
   
   /**
      The getTitle method returns the book's title.
      @return title The book's title. 
   */
   
   public String getTitle()
   {
      return title;
   }
   
   
   /**
      The setTitle method sets the book's title to the given
      string.
      @param bookTitle The book's title.
   */
   
   public void setTitle(String bookTitle)
   {
      title = bookTitle;
   }
   
   
   /**
      The getAuthor method returns the book's author.
      @return firstName The author's first name. 
   */
   
   public Author getAuthor()
   {
      return author;
   }
   
   
   /**
      The setAuthor method sets the book's author to the given
      Author object.
      @param bookAuthor The book's isbn.
   */
   
   public void setISBN(Author bookAuthor)
   {
      author = bookAuthor;
   }
   
   
   /**
      The getPublisher method returns the book's publisher.
      @return publisher The book's publisher. 
   */
   
   public String getPublisher()
   {
      return publisher;
   }
   
   
   /**
      The setPublisher method sets the book's publisher to the given
      string.
      @param pub The book's publisher.
   */
   
   public void setPublisher(String pub)
   {
      publisher = pub;
   }
   
   
   /**
      The getNumPages method returns the number of pages in
      the book.
      @return numPages The number of pages in the book. 
   */
   
   public int getNumPages()
   {
      return numPages;
   }
   
   /**
      The setNumPages method sets the number of pages in the book
      to the given integer.
      @param bookTitle The book's title.
   */
   
   public void setNumPages(int pages)
   {
      numPages = pages;
   }
   
   /**
      The toString method.
      @return A string containing the book's information.
   */
   
   public String toString()
   {
      // Create the string that contains the book's isbn,
      // title, author, publisher and number of pages.
      String str = String.format("%s, %s (ISBN-10 #%s, %d pages)",
                   title, author, isbn, numPages);
                   
      // Return string.
      return str;
   }
   
   /**
      The equals method compares the fields of a book object passed 
      as an argument with the fields of the calling object and
      returns a boolean value accordingly. 
      @return True, if the books are the same, or false otherwise.
   */
   
   public boolean equals(Book b)
   {
      // Create a boolean field to hold the status (true or
      // false).
      boolean status;
      
      // Test whether the book object's title, author, and 
      // isbn are equal to the calling object's fields.
      if (title == b.title && author == b.author && isbn == b.isbn)
         status = true;
         
      else
         status = false;
      
      // Return a boolean value based on whether the two objects
      // equal.
      return status;
   }
}

