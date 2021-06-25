package day03.test;
import java.util.Calendar;
import java.util.Scanner;

public class Ex11 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    String address = sc.nextLine();
    String date = sc.nextLine();
    
    Calendar calendar = Calendar.getInstance();
    int currYear = calendar.get(Calendar.YEAR);
    int age = 1900 + Integer.parseInt(date.substring(0,2));
    age = currYear - age + 1;
    System.out.println("이름:"+name + " 주소:"+address + " 나이: "+ age);
  }

}
