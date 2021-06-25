package day02.test;

public class Ex01 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int year = 5;         //근무(경력) 년수 
    int child = 0;        //자녀수 
    int pay = 1500000;    //초봉 기본급 
    
    switch(year) {
    case 0:
      System.out.println("신입사원입니다.");
      break;
    case 1:
      pay = pay + 200000;
      System.out.println("경력 1년입니다.");
      break;
    case 2:
      pay = pay + 400000;
      break;
    case 3:
      pay = pay + 600000;
      break;
    case 4:
      pay = pay + 800000;
      break;
    default:
      pay = pay + 150000;
      break;
    }
  }

}
