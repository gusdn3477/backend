package day05;

class Person {
  String name;
  String phone;
  static int ID;
  
  public void setName(String s) {
    name = s;
  }
  public String getPhone() {
    return phone;
  }
  public static int getID() {
    return ID;
  }
}

public class Professor extends Person {
  
  /* 상속받은 메소드의 범위는 부모 클래스보다 좁아질 수 없습니다.
  protected void setName(String s) {
    
  }
  */
  public String getPhone() {
    return phone;
  }
  public void getPhone(String s) {
    
  }
  public int getID(int id) {
    return id;
  }
}
