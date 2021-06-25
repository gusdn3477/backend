package day03.test;

class Score{
  String name;
  int korean;
  int english;
  int math;
  
  public int getTotal() {
    return korean + english + math;
  }
  
  public double getAverage() {
    return getTotal() / 3.0;
  }
  
  public void printScore() {
    System.out.println("--------------------"); 
    System.out.println("---6월 성적 내용---"); 
    System.out.println("--------------------"); 
    System.out.println("성명: " + name); 
    System.out.println("국어 점수: " + korean); 
    System.out.println("영어 점수: " + english); 
    System.out.println("수학 점수: " + math);
    System.out.println("총점: " + getTotal()); 
    System.out.println("평균: " + getAverage());
  }
}
public class ScoreCalc {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Score s1 = new Score();
    Score s2 = new Score();
    Score s3 = new Score();
    
    s1.name = "박현우";
    s1.korean = 100;
    s1.english = 85;
    s1.math = 80;
    
    s2.name = "홍길동";
    s2.korean = 90;
    s2.english = 85;
    s2.math = 85;
    
    s3.name = "티맥스";
    s3.korean = 60;
    s3.english = 85;
    s3.math = 100;
    
    s1.printScore();
    s2.printScore();
    s3.printScore();
    
  }

}
