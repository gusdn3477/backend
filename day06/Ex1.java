package day06;

public class Ex1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int a = 10;
    int b = 0;

    /*
     * if(b==0) { System.out.println("0으로 나눌 수 없습니다"); System.exit(0); }
     */
    try {
      System.out.println("a =" + a + " b = " + b);
      System.out.println("a/b = " + (a / b));
      System.out.println("나눗셈이 수행되었습니다.");
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      System.out.println("정상 실행");
    }
    
    System.out.println("정상적으로 프로그램이 완료 되었습니다.");
  }
}
