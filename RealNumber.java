public class RealNumber extends Number{
    private double value;

    public RealNumber(double v){
      value = v;
    }

    public double getValue(){
      return value;
    }

    public String toString(){
      return ""+getValue();
    }
    //---------ONLY EDIT BELOW THIS LINE------------

    public static void main (String[] args) {
      //testing equals
      RealNumber a = new RealNumber(1.00231);
      RealNumber b = new RealNumber(1.00232);
      RealNumber c = new RealNumber(0.00001);
      RealNumber d = new RealNumber(0);
      RealNumber f = new RealNumber(0);
      System.out.println(a.equals(b));
      System.out.println(a.equals(c));
      System.out.println(d.equals(f));
      System.out.println(d.equals(c));

      //testing add
      System.out.println(a.add(b).getValue());
      System.out.println(a.add(d).getValue());

      //testing multiply
      System.out.println(a.multiply(d).getValue());
      System.out.println(a.multiply(c).getValue());

      //testing divide
      try {
        System.out.println(a.divide(b));
        System.out.println(a.divide(d));
      } catch (ArithmeticException e) {
        e.printStackTrace();
      }

      //testing subtract kinda sus
      System.out.println(a.subtract(b).getValue());
      System.out.println(b.subtract(a).getValue());
      System.out.println(d.subtract(c).getValue());
      System.out.println(b.subtract(d).getValue());
    }

    /*
    *Return true when the values are within 0.001% of eachother.
    *Special case: if one is exactly zero, the other must be exactly zero.
    */
    // public boolean equals(RealNumber other){
    //   if (value != 0) {
    //     double difference = Math.abs((value-other.getValue()))/value;
    //     if (difference <= 0.00001) {
    //       return true;
    //     }
    //     return false;
    //   }
    //   return value==other.getValue();
    // }

    /*
    *Return a new RealNumber that has the value of:
    *the sum of this and the other
    */
    public RealNumber add(RealNumber other){
      //other can be ANY RealNumber, including a RationalNumber
      //or other subclasses of RealNumber (that aren't written yet)
      RealNumber sum = new RealNumber(value+other.getValue());
      return sum;
    }

    /*
    *Return a new RealNumber that has the value of:
    *the product of this and the other
    */
    public RealNumber multiply(RealNumber other){
          // RealNumber product = new RealNumber(value*other.getValue()); // experiment
          return new RealNumber(value*other.getValue());
    }

    /*
    *Return a new RealNumber that has the value of:
    *this divided by the other
    */
    public RealNumber divide(RealNumber other){
          if (other.getValue()==0) {
            throw new ArithmeticException("Division by zero");
          }
          RealNumber quotient = new RealNumber(value*other.getValue());
          return quotient;
    }

    /*
    *Return a new RealNumber that has the value of:
    *this minus the other
    */
    public RealNumber subtract(RealNumber other){
      RealNumber difference = new RealNumber(value-other.getValue());
      return difference;
    }
  }
