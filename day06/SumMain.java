package day06;

abstract class Sum{
  public abstract String toString();
  public String sum(int i, int k) {
    int sum = i + k;
    return "" + sum;
  }
}

class Sum_s1 extends Sum{
  //추상 메소드 Overrding(구현)
  public String toString() {
    return "class Sum_s1 extends Sum";
  }
}

class Sum_s2 extends Sum{
  //추상 메소드 Overriding(구현)
  public String toString() {
    return "class Sum_s2 extends Sum";
  }
}
public class SumMain {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Sum_s1 s1 = new Sum_s1();
    System.out.println(s1.sum(10, 20));
    System.out.println(s1.toString());
    
    Sum_s2 s2 = new Sum_s2();
    System.out.println(s2.sum(100, 100));
    System.out.println(s2.toString());
  }

}
