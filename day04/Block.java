package day04;

public class Block {
  String Block = "재미있는 영화";
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String b1 = "트로이";
    System.out.println("Movie:" + b1);
    {
      String b2 = "우주 전쟁";
      System.out.println("Movie:" + b2);
      int i =0;
      for(int j=0;j<5;j++) {
        //j는 이 블럭 안에서만 유지됩니다.
      }
      //System.out.println("j:" + j);
      for(i=0;i<5;i++) {
        
      }
    }
    System.out.println("Movie:" + b1);
    //ERROR
    //System.out.println("Movie:" + b2);
  }

}
