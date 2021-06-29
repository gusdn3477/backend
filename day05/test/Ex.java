package day05.test;

class A{
  public A() {
    super();
    System.out.println("생성자 A");
  }
}
class B extends A{
  public B() {
    super();
    System.out.println("생성자 B");
  }
}
class C extends B{
  public C() {
    super();
    System.out.println("생성자 C");
  }
}
public class Ex {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    C c = new C();
  }

}
