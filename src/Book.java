public class Book {

    private String bookTitle;
    private int bookId;
    private static int currID; // static variables are shared between all instances of the object. uninitialized ints default to zero

    public Book(String title){
        bookTitle = title;
        bookId = currID; // assigning the id this way means that for each new object currID will be unique as it is incremented for each instance
        currID++; // increments the static int. This increments it across all instances of this object
    }

    public void setBookTitle(String title){
        bookTitle = title;
    }

    public void setBookId(int id){
        bookId = id;
    }

    public String getBookTitle(){
        return bookTitle;
    }

    public int getBookId(){
        return bookId;
    }

    public String toString(){
        return "Book Title: " + bookTitle + "\nBook ID: " + bookId;
    }
}
