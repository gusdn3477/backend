package day05.test;

class TypeConvert{
  String url = "http://www.kma.go.kr";
  
  public void setUrl(String url) {
    this.url = url;
  }
  
  public String getUrl() {
    return this.url;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }
}
public class TypeConvertTest {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    TypeConvert tc = new TypeConvert();
    Object obj = tc;
    System.out.println(tc.getUrl());
    
    System.out.println(obj.hashCode());
    System.out.println(tc.hashCode());
    
    TypeConvert tc2 = (TypeConvert)obj;
    System.out.println("tc2: " + tc2.getUrl());
    System.out.println("tc2: " + tc2.hashCode());
    
    System.out.println(obj + " " + tc);
  }

}
