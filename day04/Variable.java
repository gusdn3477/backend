package day04;

public class Variable {
  //멤버 변수, 인스턴스 변수, 필드, Heap
  String movie = "트로이";
  
  public void show() {
    System.out.println("show 메소드 영역:" + movie);
  }
  
  public void title() {
    String movie = "아마겟돈";
    System.out.println("title 메소드 영역:" + movie);
    System.out.println("title this.movie:" + this.movie);
  }
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Variable v = new Variable();
    v.show();
    v.title();
  }

}
