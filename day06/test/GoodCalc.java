package day06.test;

abstract class Calculator {
  
  public abstract int add(int a, int b);
  public abstract int substract(int a, int b);
  public abstract double average(int[] a);
}

public class GoodCalc extends Calculator{

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int [] a = {10,20,30,40,50};
    GoodCalc c = new GoodCalc();
    System.out.println(c.add(10, 20));
    System.out.println(c.substract(40, 20));
    System.out.println(c.average(a));
  }

  @Override
  public int add(int a, int b) {
    // TODO Auto-generated method stub
    return a+b;
  }

  @Override
  public int substract(int a, int b) {
    // TODO Auto-generated method stub
    return a-b;
  }

  @Override
  public double average(int[] a) {
    // TODO Auto-generated method stub
    int total = 0;
    for(int i=0;i<a.length;i++) {
      total += a[i];
    }
    return total / (double)a.length;
  }

}
