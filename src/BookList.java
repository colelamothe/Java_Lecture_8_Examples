import java.util.ArrayList;

public class BookList {


    private ArrayList<Book> listOfBooks; // creates a private array list to be used within the class

    public BookList(){ // constructor for the class object
        listOfBooks = new ArrayList<Book>();
    }

    public boolean add(Book aBook){ // method for populating the list, this will add the new items to the end of the list
        return listOfBooks.add(aBook);
    }

    public void add(int index, Book aBook){ // method for inserting items into a specified location in the list
        listOfBooks.add(index, aBook);
    }

    public Book getBook(int index){
        return listOfBooks.get(index);
    }

    public String toString(){ // Outputs the total list of books by iterating through the array list using a for loop and the iterator syntax
        String str = "[";
        for (Book book : listOfBooks) {
            str = str + book.getBookTitle() + ",";
        }

        str += "]";

            return str;
        }
    }


