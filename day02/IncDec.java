package day02;

public class IncDec {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    long i = 0;
    long hap = 0;
    
    hap = ++i;
    hap = i;
    hap = i ++;
    i ++;
    hap = i;
    hap = ++hap + ++i;
    System.out.println("hap: " + hap + "   i: " + i);
  }

}
