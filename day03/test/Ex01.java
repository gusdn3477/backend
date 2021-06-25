package day03.test;

public class Ex01 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] arr = {15, 25, 35, 45, 55};
    int total = 0;
    double aver = 0.0;
    for(int i=0;i<arr.length;i++) {
      total += arr[i];
    }
    aver = (double)total / arr.length;
    System.out.println(aver);
  }

}
