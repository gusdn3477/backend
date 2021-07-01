package day07;

import java.util.*;

public class BoxingUnBoxingMain {
  public static void main(String[] args) {
//    Vector<Integer> v = new Vector<Integer>(5, 5); // Generics
    Vector<Character> vs = new Vector<Character>(5,5);
    
//    v.add(1);// boxing //Java5
//    v.add(5);
//    v.add(4);
//    v.add(8);
//    v.add(3);
    vs.add('a');
    vs.add('b');
    vs.add('c');
    vs.add('d');
    vs.add('e');
    
    //prints(v);    
    prints2(vs);
  }

//  public static void prints(Vector<Integer> vi) {
//    int num = vi.size();
//    int sum = 0;
//    for (int j = 0; j < num; j++) {
//      sum += vi.get(j);
//    } // for
//    System.out.println("합   : " + sum);
//  }// prints
  
  public static void prints2(Vector<Character> vi) {
    int num = vi.size();
    for (int j = 0; j < num; j++) {
      System.out.print(vi.get(j));
    } // for
  }// prints
}