public class Rational {
    private int numerator;
    private int denominator;

    public Rational(){ // basic constructor used when a new rational is defined without entering any parameters
        numerator = 0;
        denominator = 1;
    }

    public Rational(int n, int d){ // second constructor allows for creation and assignment at the same time. More than one constructor can be written but it will only use one
        numerator = n;
        denominator = d;
    }

    public void invert(){ // flips the fraction
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    public double toDouble(){ // outputs the double value of the fraction
        return (double)numerator/denominator;
    }

    public void reduce(){ // uses the gcd method to find the lowest common form of the fraction
        int gcd = gcd(numerator, denominator); // calculates the lowest common factor
        numerator /= gcd; // calculates the new numerator
        denominator /= gcd; // calculates the new denominator
    }
    public void negate(){ // flips the sign of the fraction
        numerator *= -1;
    }

    public Rational add(Rational x){ // adds then reduces two fractions
        Rational sum = new Rational(numerator*x.denominator + x.numerator*denominator, denominator*x.denominator);
        sum.reduce();
        return sum;
    }
    public int gcd(int a, int b){ // this uses an old algorithm to find the lowest common factor
        if (b > a){
           int temp = a;
           a = b;
           b = temp;
        }
        int r = a % b;
        while (r!=0){
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public String toString(){
        return numerator + " / " + denominator;
    }
}
