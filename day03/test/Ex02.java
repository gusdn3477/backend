package day03.test;

public class Ex02 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    double[] arr = {15.5, 23.5, 53.5, 42.5, 35.5};
    double max = arr[0];
    double min = arr[0];
    
    for(int i=0;i<arr.length;i++) {
      if(arr[i] > max)
        max = arr[i];
      if(arr[i] < min)
        min = arr[i];
    }
    System.out.println("최댓값 : "+max+" 최솟값 :" + min);
  }

}
