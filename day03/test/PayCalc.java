package day03.test;

class Pay {
  private String name;
  private int bonbong;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setBonbong(int bonbong) {
    this.bonbong = bonbong;
  }

  public int getBonbong() {
    return bonbong;
  }

  public int taxCalc() {
    return (int) (bonbong * 0.045 + 0.5);
  }


  public int silsuCalc() {
    return bonbong - taxCalc();
  }
  
  public void printPay() {
    System.out.println("--------------------");
    System.out.println("---12월 급여 내역---");
    System.out.println("--------------------");
    System.out.println("성명: " + name);
    System.out.println("본봉: " + bonbong);
    System.out.println("세금: " + taxCalc());
    System.out.println("실수령액: " + silsuCalc());
  }
}

public class PayCalc {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Pay p1 = new Pay();
    Pay p2 = new Pay();
    Pay p3 = new Pay();
    p1.setBonbong(2500000);
    p1.setName("왕눈이");
    
    p2.setBonbong(1500000);
    p2.setName("아로마");
    
    p3.setBonbong(1500000);
    p3.setName("투투");
    
    p1.printPay();
    p2.printPay();
    p3.printPay();
  }

}
