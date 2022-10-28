package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Cpractice2 {

	public static void main(String[] args) {
		// 1. 사이트에 연결해서, html문서를 다 가져오자
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930\r\n" + "").get();

//			Elements list = doc.select(".code"); // class가 nav인 태그
//			System.out.println(list.size());
//
//			Element tag = list.get(0);
//			System.out.println(tag.text()); // <a> 메일 중에서 메일만 추출
			
			Elements list = doc.select(".blind");
			System.out.println(list.size());
			//System.out.println(list);
//			for (int i = 0; i <list.size(); i++) {
//			    Element tag=list.get(i);
//			    System.out.println(tag.text());
//			}
			Element tag=list.get(16);
			System.out.println(tag.text());
			Element tag2=list.get(19);
			System.out.println(tag2.text());
			
			Element tag3=list.get(20);
			System.out.println(tag3.text());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}