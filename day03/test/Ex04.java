package day03.test;

import java.util.Calendar;

public class Ex04 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String jumin = args[3];
    int age = Integer.parseInt(jumin.substring(0,2));
    age += 1900;
    
    Calendar calendar = Calendar.getInstance();
    int currYear = calendar.get(Calendar.YEAR);
    int answer = currYear - age + 1;
    System.out.print("현재 나이 : " + answer);
  }

}
