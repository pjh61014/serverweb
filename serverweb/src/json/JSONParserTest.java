package json;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//mydata.json파일을 파싱해서 콘솔에 출력해보기 
//name:______
//addr:____
//age:_____
//subject:____--
public class JSONParserTest {

	public static void main(String[] args) throws Exception {
		//1.파서생성
		JSONParser jsonparser = new JSONParser();
		//2.파싱해서 얻은 결과가 jsonobject인 경우
		JSONObject jsonobj = (JSONObject) jsonparser.parse(new FileReader("src/json/mydata.json"));
		//3. jsonobject로 부터 데이터 얻기
		String name = (String)jsonobj.get("name");
		String addr = (String)jsonobj.get("addr");
		String age = (String)jsonobj.get("age");
		
		System.out.println("name "+name);
		System.out.println("addr "+addr);
		System.out.println("age "+age);
		
		//4. jsonarray받기
		JSONArray subjectlist = (JSONArray)jsonobj.get("subjectlist");
		
		for (int i = 0; i < subjectlist.size(); i++) {
			
			String arrayData = (String) subjectlist.get(i);
			System.out.println("subjectlist: "+arrayData);
			
		}
	
		
	}

}
