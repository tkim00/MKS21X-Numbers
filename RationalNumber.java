public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *param nume the numerator
  *param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    numerator = nume;
    denominator = deno;
    if(deno == 0){
      numerator = 0;
      denominator = 1;
    }
  }

  public double getValue(){
    return (double)numerator/denominator;
  }

  /**
  *return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    return RationalNumber(denominator, numerator);
  }
  /**
  *return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return numerator == denominator;
  }


  /**
  *return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return "" + numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *param a the first integers
  *param b the second integer
  *return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    //http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    if(a<0){a*-1}
    if(b<0){b*-1}
    int dividend;
    int divisor;
    if(a>=b){
      dividend = a;
      divisor = b;
    }else{
      dividend = b;
      divisor = a;
    }
    while(dividend % divisor != 0){
      dividend = divisor;
      divisor = dividend % divisor;
    }
    return divisor;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){

  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return null;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return null;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return null;
  }
}
