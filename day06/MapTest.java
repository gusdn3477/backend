package day06;

import java.util.*;

public class MapTest {
  public static void main(String[] args) {
    HashMap list = new HashMap();
    list.put("0", "lee");
    list.clear();// 모두 제거
    list.put("1", "cho");
    list.put("2", "kim");
    list.put("3", "chung");
    list.put("4", "min");
    list.put("3", "jung");
    System.out.println(list.size());// size()
    System.out.println(list.containsKey("3"));
    list.remove("2");
    System.out.println(list.size());

    print(list);// Set 만들기
  }

  public static void print(Map sets) {
    Set set = sets.keySet();// key값을 Set으로
    Iterator iter = set.iterator();
    while (iter.hasNext()) {
      String key = (String) iter.next();
      System.out.println(key + "  " + sets.get(key));// value
    }
  }//
}
