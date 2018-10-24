public class DriverNumbers{
  public static void main(String[] args){
    RealNumber real1 = new RealNumber(23.1);
    RealNumber real2 = new RealNumber(69.45);
    RationalNumber rational1 = new RationalNumber(3, 5);
    RationalNumber rational2 = new RationalNumber(17, 8);

    System.out.println(real1.add(real2));
    System.out.println(real1.add(rational1));
    System.out.println(real1.subtract(real2));
    System.out.println(real1.subtract(rational1));
    System.out.println(real1.multiply(real2));
    System.out.println(real1.multiply(rational1));
    System.out.println(real1.divide(real2));
    System.out.println(real1.divide(rational1));
    System.out.println(rational1.reciprocal());
    System.out.println(rational1.equals());
    System.out.println(rational1.add(rational2));
    System.out.println(rational1.subtract(rational2));
    System.out.println(rational1.multiply(rational2));
    System.out.println(rational1.divide(rational2));
  }
}
