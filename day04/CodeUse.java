package day04;

class Code{
  public String getArea(int index) {
    String[] areas = {"서울", "천안", "대전", "대구", "광주", "강릉"};
    return areas[index-1];
  }
}
public class CodeUse {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Code co = new Code();
    String area = co.getArea(6);
    
    System.out.println(area);
  }

}
