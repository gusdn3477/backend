package day03.test;

public class Ex05 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    if(a>=b) {
      System.out.println("최솟값은 " +b+" 최댓값은 " +a+"입니다.");
    }
    else {
      System.out.println("최솟값은 " +a+" 최댓값은 " +b+"입니다.");
    }
  }

}
