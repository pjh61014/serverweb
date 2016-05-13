package json;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONMaker {

	public static void main(String[] args) throws Exception {
		//{ } : JSONObject
		//[ ] : JSONArray
		JSONObject myjson = new JSONObject();
		myjson.put("name","±Ëº≠ø¨");
		myjson.put("addr","¿Œ√µ");
		myjson.put("age","25");
		
		JSONArray subjectlist = new JSONArray();
		
		subjectlist.add("java");
		subjectlist.add("servlet");
		subjectlist.add("hadoop");
		subjectlist.add("spring");
		
		myjson.put("subjectlist", subjectlist);
		
		FileWriter fw = new FileWriter("src/json/mydata.json");
		fw.write(myjson.toJSONString());
		fw.flush();
		fw.close();
		
		System.out.println(myjson.toJSONString());
		

	}

}
