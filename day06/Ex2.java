package day06;

public class Ex2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String str = "안녕";
    
    try {
      System.out.println("문자열중 첫 번째 문자 하나만 추출합니다.");
      char a = str.charAt(2);
      System.out.println("추출된 문자 : " + a);
    }catch(Exception e) {
      System.out.println(e);
    }finally {
      System.out.println("항상 실행");
    }
    
    System.out.println("정상적으로 프로그램이 종료되었습니다.");
  }
}
