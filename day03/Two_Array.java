package day03;

public class Two_Array {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int [][] m = {{10,20}, {30,40}, {50,60}};
    int [][] m2 = new int[3][2];
    
    for(int i=0;i<3;i++) {
      for(int j=0;j<2;j++) {
        System.out.println("m["+i+"]n["+j+"]=" + m[i][j]);
      }
    }
  }

}
