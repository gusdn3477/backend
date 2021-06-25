package day04;

class Box{
  int cnt = 0;
  static long boxID = 0;
  
  public Box() {
    boxID = boxID + 1;
    cnt = cnt + 1;
    System.out.println("멤버 변수 cnt:" + cnt);
    System.out.println("static 변수 BoxID: " + boxID);
  }
  
  /*
   public void staticTest(){
   static long count = 0;
   count = count + 1;
   */
  
  /*
   public static void staticTest2(){
   static long count = 0;
   count = count + 1
   */
}
public class StaticDemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Box mybox1 = new Box();
    Box mybox2 = new Box();
    Box mybox3 = new Box();
  }

}
