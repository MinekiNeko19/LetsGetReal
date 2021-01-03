public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public static void main(String[] args) {
    // testing constructor and getvalues
    // RationalNumber a = new RationalNumber(1, 3);
    // System.out.println(a.getValue());
    // System.out.println(a.getNumerator());
    // System.out.println(a.getDenominator());
    // RationalNumber b = new RationalNumber(13,-3);
    // System.out.println(b.getValue());
    // System.out.println(b.getNumerator());
    // System.out.println(b.getDenominator());
    // RationalNumber c = new RationalNumber(9, 0);
    // System.out.println(c.getValue());
    // System.out.println(c.getNumerator());
    // System.out.println(c.getDenominator());

    // testing reciprocal
    // RationalNumber d = b.reciprocal();
    // System.out.println(d.getValue());
    // System.out.println(d.getNumerator());
    // System.out.println(d.getDenominator());

    // testing equals
    // RationalNumber e = new RationalNumber(1, 3);
    // System.out.println(a.equals(c));
    // System.out.println(a.equals(e));

    // testing toString
    // System.out.println(a.toString());
    // System.out.println(c.toString());
    // System.out.println(new RationalNumber(8, 1).toString());

    // testing gcd
    // System.out.println(gcd(210, 45));

    // testing reduce
    // RationalNumber f = new RationalNumber(210, 45);
    // System.out.println(f.getValue());
    // System.out.println(f.getNumerator());
    // System.out.println(f.getDenominator());
    // f.reduce();
    // System.out.println(f.getValue());
    // System.out.println(f.getNumerator());
    // System.out.println(f.getDenominator());  
    
    // testing multiply and divide
    // System.out.println(a.multiply(b).getValue()); 
    // System.out.println(a.divide(b).getValue());

    // testing add and subtract
    // System.out.println(a.add(b).getValue());
    // System.out.println(b.subtract(a).getValue());
  }

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *  If the denominator is negative, negate both numerator and denominator
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    } else if (deno < 0) {
      numerator = -nume;
      denominator = -deno;
    } else {
      numerator = nume;
      denominator = deno;
    }
    // this.reduce();
  }

  public double getValue(){
    return ((double)numerator)/((double)denominator);
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    return new RationalNumber(denominator, numerator);
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return this.getValue()==other.getValue();
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    if (numerator==0) {
      return "0";
    }
    if (denominator==1) {
      return ""+numerator;
    }
    return numerator+"/"+denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one 
    http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html*/
    a = Math.abs(a);  b = Math.abs(b);
    if (a<b) {
      int temp = b;
      a = b;
      b = temp;
    }
    int remainder = a%b;
    while (remainder != 0) {
      remainder = a%b;
      a = b;
      b = remainder;
    }
    return b;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int gcd = gcd(numerator, denominator);
    numerator = numerator/gcd;
    denominator = denominator/gcd;
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(numerator*other.getNumerator(), denominator*other.getDenominator());
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    return new RationalNumber(numerator*other.getDenominator(), denominator*other.getNumerator());
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    return new RationalNumber(numerator*other.getDenominator()+other.getNumerator()*denominator, denominator*other.getDenominator());
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    return new RationalNumber(numerator*other.getDenominator()-other.getNumerator()*denominator, denominator*other.getDenominator());
  }
} 