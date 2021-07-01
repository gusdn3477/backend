package day06;

interface Green{
  public String greenColor();
}

class GreenImpl implements Green{
  public String greenColor() {
    return "초록색입니다.";
  }
}

interface Red{
  public String redColor();
}

class RedImpl implements Red{
  public String redColor() {
    return "빨간색입니다";
  }
}

public class ColorMain {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Green gr = new GreenImpl();
  }

}
