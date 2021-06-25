package day03;

public class ArrayWhile2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String[] movies = {"그래비티", "맘마 미아", "레미제라블", "윌터의 상상은 현실이 된다", "노아"};
    int[] years = {2014, 2008, 2012, 2013, 2014};
    
    int cnt = -1;
    while(cnt < movies.length - 1) {
      cnt = cnt + 1;
      System.out.println(movies[cnt] + "-" + years[cnt]);
    }
  }

}
