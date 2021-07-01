package day07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverTestMySQL {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Connection con = null;
    String url = "jdbc:mysql://127.0.0.1:3306/javadb?useUnicode=true&characterEncoding=utf8";
    String user = "javauser";
    String password = "1234";
    try {
      Class.forName("org.gjt.mm.mysql.Driver");
      con = DriverManager.getConnection(url, user, password);
      System.out.println("데이터베이스에 접속했습니다.");
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      try {
        // 데이터베이스 접속을 닫습니다.
        if (con != null) {
          con.close();
        }
      } catch (Exception e) {
      }
    }

  }
}
