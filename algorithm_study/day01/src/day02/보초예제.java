package day02;

import java.util.Scanner;

public class 보초예제 {

   public static void main(String[] args) {
      Scanner stdIn = new Scanner(System.in);//자동 import 단축키 ctrl + shift + o
      System.out.println("요솟수");
      int num = stdIn.nextInt();
      int[] x = new int[num + 1];
      
      for(int i = 0; i < num; i++) {
         System.out.println("x[" + i + "]");
         x[i] = stdIn.nextInt();
      }
      System.out.println("검색할 값 : ");
      int ky = stdIn.nextInt();
   
      int idx = 보초메서드(x, num, ky);
      if(idx == -1) {
         System.out.println("그값의 요소가 없습니다.");
      }
      else {
         System.out.println("그 값은 x[" + idx + "]에 있습니다.");
      }
   }
   private static int 보초메서드(int[] x, int num, int key) {
         int i = 0;
         x[num] = key;
         while (true) {
            if (x[i] == key)
               break;
            i++;

         }

      return i == num ? -1: i;
   }

}