package day04;

class Pay{
  int ppp;
  public void payRefer(Pay a) {
    a.ppp = a.ppp + 2000;
  }
  public int payValue(int j) {
    return j + 2000;
  }
}

public class PayTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Pay p = new Pay();
    p.ppp = 10;
    int i = 10;
    p.payRefer(p);
    i = p.payValue(i);
    
    System.out.println(p.ppp);
    System.out.println(i);
  }

}
