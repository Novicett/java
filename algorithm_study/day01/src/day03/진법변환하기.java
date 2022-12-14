package day03;

public class 진법변환하기 {

   public static void main(String[] args) {
      Util util = new Util();

      System.out.println("<< 진법 변환 프로그램 >> ");
      int n = 14;
      // 10진수를 2진수로 바꾸기
      System.out.println("10진수"+ n + "를 2진수로 바꾸면 >> " + util.decToBin(n));
      // 2진수를 10진수로 바꾸기
      String bn = "1010";
      System.out.println("2진수를" + bn + "를 10진수로 바꾸면 >> " + util.decToBin(n));
   }

}

class Util {

   public String decToBin(int value) {
      String result = ""; // 결과값 변수
      int mok, nmg; // 몫, 나머지
      mok = value; // ex) mok =14
      while (mok != 0) { // 0이 될떄까지 2로 계속 나눔
         nmg = mok % 2;
         //숫자 0을 문자로 만들기 String.valueOf(ngm);
         //유니코드표에 문자 0은 코드표로 48입니다. 그래서 숫자(0) + 48을 하면 문자 0이 나옴
         result += (char)(nmg + '0');
         //문자 1글자 " " 문자욜 1글자 이상
         mok = mok /2;
      }
      //문자열로 된 결과를 반대로 뒤집기
      //String ---->char[]
      char[] r = result.toCharArray();
      for(int i = 0; i < r.length; i++) {
         char temp = r[i];
             r[i] = r[r.length - i - 1];//i = 0일때 r[0] <-> r[3] i = 1 일때 r[1] <-> r[2]
         r[r.length - i -1] = temp;
      }
      //char[] -- > String 바꾸기
      return String.valueOf(r);
      
   }

}