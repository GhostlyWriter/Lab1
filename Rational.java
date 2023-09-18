import java.util.Scanner;
/**
 * Rational Number Class
 */
public class Rational {
/** 
 * The Global Variables of any class should accuracte reflect the behaviours of that class.
 * For example, this rational number class has only two data fields, a Numerator and a Denominator.
 * As a result, the only two Global Variable initialized are named a both Numerator and Denominator.
 */    
 int numerator; // Every rational number, expressed as a fraction, contains a numerator 
 int denominator; // Every rational number, expressed as fraction, cotains a denominator or divisor 

Rational () {} //This is a default constructor 

Rational (int num, int denom) // This is a constructor that passes values from the parameters to the global of the variables of the rational class
{
 numerator = num;
 denominator = denom;
}
void myFraction () //This function 
{
 System.out.println("Your fraction is: " + numerator + "/" + denominator);    
}

int getNumerator ()
{
return numerator;
}

int getDenominator ()
{
return denominator;
}



public static void main(String[] args) 
{

 Rational fraction1 = new Rational(3,5);
 Rational fraction2 = new Rational(4,5);
 System.out.println("Hello \n"); 
 fraction1.myFraction();
 fraction2.myFraction();
 fraction1.multiply();

}
void multiply() 
{
Scanner userinput1 = new Scanner(System.in);      
System.out.println("Enter the numerator of the new fraction you wish to multiply: \n");
int newNumerator = userinput1.nextInt();
newNumerator = newNumerator * numerator;
System.out.println("Please enter the denominator you wish to multiply");
int newDenominator = userinput1.nextInt();
newDenominator = newDenominator * denominator;
while (newDenominator <= 0) 
{
System.out.println ("Now, please enter the denominator of the new fraction you wish to multiply, BE SURE to only type a non-zero postive number for the denominator! \n");
newDenominator = userinput1.nextInt();

}
Rational fractionProduct = new Rational (newNumerator,newDenominator);
System.out.println("After the requested multpication, your new fraction is: " + fractionProduct.numerator + "/" + fractionProduct.denominator);

}

}