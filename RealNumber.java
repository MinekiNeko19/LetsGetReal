public class RealNumber{
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
      RealNumber a = new RealNumber(1.00231);
      RealNumber b = new RealNumber(1.00232);
      RealNumber c = new RealNumber(0.00001);
      RealNumber d = new RealNumber(0);
      RealNumber f = new RealNumber(0);
      System.out.println(a.equals(b));
      System.out.println(a.equals(c));
      System.out.println(d.equals(f));
      System.out.println(d.equals(c));
    }

    /*
    *Return true when the values are within 0.001% of eachother.
    *Special case: if one is exactly zero, the other must be exactly zero.
    */
    public boolean equals(RealNumber other){
      if (value != 0) {
        double difference = Math.abs((value-other.getValue()))/value;
        if (difference <= 0.00001) {
          return true;
        }
        return false;
      }
      return value==other.value;
    }

    /*
    *Return a new RealNumber that has the value of:
    *the sum of this and the other
    */
    public RealNumber add(RealNumber other){
       //other can be ANY RealNumber, including a RationalNumber
       //or other subclasses of RealNumber (that aren't written yet)
       return null;
    }

    /*
    *Return a new RealNumber that has the value of:
    *the product of this and the other
    */
    public RealNumber multiply(RealNumber other){
          return null;
    }

    /*
    *Return a new RealNumber that has the value of:
    *this divided by the other
    */
    public RealNumber divide(RealNumber other){
          return null;
    }

    /*
    *Return a new RealNumber that has the value of:
    *this minus the other
    */
    public RealNumber subtract(RealNumber other){
      return null;
    }
  }
