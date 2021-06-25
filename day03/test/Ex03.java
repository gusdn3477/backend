package day03.test;

public class Ex03 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] arr = {15, -25, 35, -45, 50};
    
    for(int i=0;i<arr.length;i++) {
      if(arr[i] < 0) {
        arr[i] = arr[i] * -1;
      }
    }
    
    for(int i=0;i<arr.length;i++) {
      System.out.print(arr[i] + " ");
    }
  }

}
