package openapi;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLParserTest01 {

	public static void main(String[] args) throws IOException {
		//1. ���ϴ� ������ �ִ� HTML �������� �����ؼ� ���ϴ� ������ �������� 
		Document document = Jsoup.connect("http://www.naver.com").get();
		
		if(document!=null){
			
			Elements elements= document.select("ol#realrank > li:not(#lastrank) > a");
			System.out.println(elements.size());
			for (int i = 0; i <elements.size(); i++) {
				
				Element tag = elements.get(i);
				System.out.println("************************");
				System.out.println((i+1)+">�˻���:"+tag.attr("title"));
				System.out.println((i+1)+">���:"+tag.select("span.tx").text());
				System.out.println((i+1)+">�ܰ�:"+tag.select("span.rk").text());
				System.out.println("************************");
				
			}
		}

	}

}
