/* Siddharth Korukonda
   115607752
   CSE 114
   Paul Fodor
   Homework 6
   Question 3 (Rational.java)
 */

import java.util.*;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        int a = numerator;
        int b = denominator;

        while (b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
        }

        this.numerator = numerator/a;
        this.denominator = denominator/a;

        if (this.denominator<0) {
            this.numerator*=-1;
            this.denominator*=-1;
        }
    }

    public Rational() {
        this(0,1);
    }

    public int get_numerator() {
        return numerator;
    }

    public int get_denominator() {
        return denominator;
    }

    public static Rational add(Rational r1, Rational r2) {
        int newNumerator = (r1.numerator*r2.denominator)+(r2.numerator*r1.denominator);
        int newDenominator = (r1.denominator*r2.denominator);
        return new Rational(newNumerator,newDenominator);
    }

    public static Rational subtract(Rational r1, Rational r2) {
        int newNumerator = (r1.numerator*r2.denominator)-(r2.numerator*r1.denominator);
        int newDenominator = (r1.denominator* r2.denominator);
        return new Rational(newNumerator,newDenominator);
    }

    public static Rational multiply(Rational r1, Rational r2) {
        int newNumerator = (r1.numerator*r2.numerator);
        int newDenominator = (r1.denominator*r2.denominator);
        return new Rational(newNumerator,newDenominator);
    }

    public static Rational divide(Rational r1, Rational r2) {
        int newNumerator = (r1.numerator*r2.denominator);
        int newDenominator = (r1.denominator*r2.numerator);
        return new Rational(newNumerator,newDenominator);
    }

    public void print() {
        System.out.println(this.numerator+"/"+this.denominator);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the numerator for the first rational number: ");
        int numerator1 = s.nextInt();
        System.out.print("Enter a non-zero denominator for the first rational number: ");
        int denominator1 = s.nextInt();
        System.out.print("Enter the numerator for the second rational number: ");
        int numerator2 = s.nextInt();
        System.out.print("Enter a non-zero denominator for the second rational number: ");
        int denominator2 = s.nextInt();

        Rational r1 = new Rational(numerator1, denominator1);
        Rational r2 = new Rational(numerator2, denominator2);

        System.out.print("First rational number is: ");
        r1.print();
        System.out.print("Second rational number is: ");
        r2.print();

        System.out.print("Addition of the rational numbers is: ");
        Rational.add(r1,r2).print();
        System.out.print("Subtraction of the rational numbers is: ");
        Rational.subtract(r1,r2).print();
        System.out.print("Multiplication of the rational numbers is: ");
        Rational.multiply(r1,r2).print();
        System.out.print("Division of the rational numbers is: ");
        Rational.divide(r1,r2).print();
    }
}
