package day02.test;

public class Ex04 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int point = 50;
    switch(point/10) {
    case 10:
      break;
    case 9:
      System.out.println("등급은 A입니다.");
      break;
    case 8:
      System.out.println("B");
      break;
    case 7:
      System.out.println("C");
      break;
    case 6:
      System.out.println("D");
      break;
    default:
      System.out.println("노력하세요.");
      break;
    }
    
  }

}
