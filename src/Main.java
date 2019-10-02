import java.util.ArrayList;
import java.math.BigInteger; // used when you have something bigger than a long int can manage

public class Main {

    /*
    1. create a book class, with title and id; constructor
    methods to get and set the title
    create a booklist class using arraylist<book>
    constructor; methods to add and get book; toString

    2.Write a class to calculate factorial(n) (n! = (n*(n-1).....)
    Write a main method to call factorial n times to print the factorials up to n
    Run it with factorial(30)

    3. Create a new class called Rational, has two instance variables, both ints:
    numerator, denominator
    Wire a constructor that takes no arguments, numerator = 0, denominator = 1
    Write a second constructor that takes two ints and sets the numerator and denominator to those values
    Write a toString() method to print the fraction
    Write the modifier methods :
    negate() - flips the sign of the numerator
    invert() - inverts the fraction
    reduce() - reduces the fraction to its lowest fractional form (numerator and denominator have no common factors)
               need to use gcd(a,b) greatest common divisor of two numbers a and b
               r = a % b when a > b gcd(a,b) = gcd(b, r) = rb = b % r gcd(r, rb) = . . . gcd(r , 0) where r is the greatest common divisor
               once you have the gcd then divide numerator and denominator
    Write the non-modifier methods:
    toDouble() - returns the float value of the fraction
    add() - returns the sum of two fractions, as a rational object
     */

    public static void main(String[] args){

        // creating seven new book objects
        Book book1 = new Book("Red Rising");
        System.out.println(book1.toString());
        Book book2 = new Book("Mistborn");
        Book book3 = new Book("Rithmatist");
        Book book4 = new Book("The Collection");
        Book book5 = new Book("Swordbreaker");
        Book book6 = new Book("Men on the moon");
        Book book7 = new Book("Artemis");

        BookList myBooks = new BookList(); // creating a new book list object. This will serve as an index of the books already made above

        // populating the booklist
        myBooks.add(book1);
        myBooks.add(book2);
        myBooks.add(book3);
        myBooks.add(book4);
        myBooks.add(book5);
        myBooks.add(book6);
        myBooks.add(book7);

        System.out.println(myBooks.toString());

        // An array list operates in a similar way but is already defined by Java
        ArrayList<String> words = new ArrayList<String>();
        String s = "Hello";
        words.add(s); // adds the string hello as a string object to the array list
        words.add("goodbye"); // the array list can create string objects as well as a special case
        System.out.println(words); // prints the array list
        s = s.toUpperCase(); // s is a string "Hello" sending it to upper case like this does not change the original object but creates a new one with s pointed to that instead
        System.out.println(s); // Outputs the upper case version of the string
        System.out.println(words); // this outputs the original lowercase because the lowercase object is what was added not the new uppercase version

        //Factorial

        for (int i = 1; i<= 30; i++){ // calculates the factorial equal to the upper bound of the for loop ie. 30!
            System.out.println(i + "! = " + factorial(i)); // calls the factorial method at the bottom of this class to calculate.
        }


        // Rational

        Rational num = new Rational(30 , 45);
        System.out.println(num);
        num.reduce();
        System.out.println(num);
        num.invert();
        System.out.println(num);
        Rational num2 = new Rational(15,25);

        System.out.println(num.add(num2));

    }

    public static BigInteger factorial(int n){ // BigInteger is a special object type used for large integer handling beyond int and long
        // int result = 1; int is not big enough to handle this
        BigInteger result = BigInteger.valueOf(1);
        for (int i = n; i > 1; i--){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
