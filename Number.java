public abstract class Number{
  public static void main(String[] args) {
    Number a = new RealNumber(1.00231);
    Number b = new RealNumber(1.00232);
    Number c = new RealNumber(0.00001);
    Number d = new RationalNumber(9,0);
    Number f = new RealNumber(0);
    
    // testing compareTo
    System.out.println(d.compareTo(f));
    System.out.println(a.compareTo(b));
    System.out.println(b.compareTo(a));
  }
  public abstract double getValue();

  /*return 0 when this Number equals the other RealNumber
  return a negative value when this Number is smaller than the other Number
  return a positive value when this Number is larger than the other Number
  */
  public int compareTo(Number other){
    if (this.getValue()==other.getValue()) {
        return 0;
    } else if (this.getValue() < other.getValue()) {
        return -1;
    }
    return 1;
  }

  /*
  *Return true when the % difference of the values
  *are within 0.00001 of eachother.
  *Special case: if one is exactly zero, the other must be exactly zero.
  */
  public boolean equals(Number other){
    if (this.getValue() != 0) {
        double difference = Math.abs((this.getValue()-other.getValue()))/this.getValue();
        if (difference <= 0.00001) {
          return true;
        }
        return false;
      }
      return this.getValue()==other.getValue();
    }
}