package day02;

public class Sungjuk {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String name = "왕눈이";
    int kuk = 92;
    int eng = 88;
    int mat = 80;
    int tot = kuk + eng + mat;
    int avg = tot / 3;
    
    System.out.println("성적 처리");
    System.out.println("------------");
    System.out.println("성명: " + name);
    System.out.println("국어: " + kuk);
    System.out.println("영어: " + eng);
    System.out.println("수학: " + mat);
    System.out.println("총점: " + tot);
    System.out.println("평균: " + avg);
  }

}
