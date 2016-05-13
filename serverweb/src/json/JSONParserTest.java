package json;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//mydata.json������ �Ľ��ؼ� �ֿܼ� ����غ��� 
//name:______
//addr:____
//age:_____
//subject:____--
public class JSONParserTest {

	public static void main(String[] args) throws Exception {
		//1.�ļ�����
		JSONParser jsonparser = new JSONParser();
		//2.�Ľ��ؼ� ���� ����� jsonobject�� ���
		JSONObject jsonobj = (JSONObject) jsonparser.parse(new FileReader("src/json/mydata.json"));
		//3. jsonobject�� ���� ������ ���
		String name = (String)jsonobj.get("name");
		String addr = (String)jsonobj.get("addr");
		String age = (String)jsonobj.get("age");
		
		System.out.println("name "+name);
		System.out.println("addr "+addr);
		System.out.println("age "+age);
		
		//4. jsonarray�ޱ�
		JSONArray subjectlist = (JSONArray)jsonobj.get("subjectlist");
		
		for (int i = 0; i < subjectlist.size(); i++) {
			
			String arrayData = (String) subjectlist.get(i);
			System.out.println("subjectlist: "+arrayData);
			
		}
	
		
	}

}
