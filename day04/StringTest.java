package day04;

public class StringTest {
  
  public void changeString(String src) {
    src = "JSP";
  }
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("ABCD".toLowerCase());
    System.out.println("ABCD".hashCode());
    
    String step = "JAVA";
    StringTest st = new StringTest();
    System.out.println(step);
    st.changeString(step);
    System.out.println(step);
  }

}
