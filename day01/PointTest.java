package day01;

class Point{
  int x,y; //멤버변수 필드
  Point(int x, int y){ //생성자
    this.x = x;
    this.y = y;
  }
}

public class PointTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Point obj1 = new Point(1,2);
    Point obj2 = obj1;
    System.out.printf("%d %d\n", obj1.x, obj1.y);
    obj2.x = 20;
    System.out.printf("%d %d\n", obj2.x, obj2.y);
    System.out.printf("%d %d\n", obj1.x, obj1.y);
    System.out.printf("%d %d\n", obj1.hashCode(), obj1.hashCode());
    System.out.printf("%d %d\n", obj2.hashCode(), obj1.hashCode());
    
  }

}
