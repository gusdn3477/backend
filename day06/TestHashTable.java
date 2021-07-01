package day06;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class TestHashTable {
  public static void main(String[] args) {
    Hashtable ht = new Hashtable();

    ht.put("AREA01", "대한민국");
    ht.put("AREA02", "러시아");
    ht.put("AREA03", "중국");
    ht.put("AREA04", "일본");
    
    Enumeration e = ht.keys();
    Iterator iter = ht.keySet().iterator();
    
    while(iter.hasNext()) {
      String key = (String)iter.next();
      String value = (String)ht.get(key);
      System.out.println("key : " + key + "value : " + value);
    }
    
    while(e.hasMoreElements()) {
      String key = (String)e.nextElement();
      String value = (String)ht.get(key);
      System.out.println("key : " + key + "value : " + value);
    }
    
    String area = (String) ht.get("AREA01");
    // String area = (String)ht.get("AREA05");

    if (area != null) {
      System.out.println(area);
    } else {
      System.out.println("검색 지역이 없습니다.");
    }
  }
}