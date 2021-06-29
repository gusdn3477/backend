package day05;

class OverB{
  void show() {
    System.out.println("부모클래스메소드 show()");
  }
  
  void parent() {
    System.out.println("부모클래스에만 있는 메소드 parent()");
  }
}

class SubOverB extends OverB{
  void show() {
    System.out.println("자식클래스의 메소드 show()");
  }
}

public class OverrideExam2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    OverB ob = new OverB();
    ob.show();
    ob.parent();
    
    SubOverB over = new SubOverB();
    over.show();
    over.parent();

  }

}
