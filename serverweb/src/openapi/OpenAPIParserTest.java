package openapi;

import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class OpenAPIParserTest {
	
	public static void main(String[] args) {
	
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		ArrayList<String> list = new ArrayList<String>();
		try {
			DocumentBuilder dombuilder = factory.newDocumentBuilder();
			String pharm_url= "http://openapi.hira.or.kr/openapi/service/pharmacyInfoService/getParmacyBasisList"
			+"?pageNo=1&numOfRows=10&sidoCd=110000&sgguCd=110019&ServiceKey=";
			
			String key ="oAu06j0HQ70jL%2FkDCsNmhrXqIKSGGQXbrHxQFSJEh7za5zR8tS9Guqhjppe%2BbnQVWWHCisz1c2Xb3ECWPth78g%3D%3D";
			String url = pharm_url+key;
			
			Document document  = dombuilder.parse(url);
			//System.out.println(document);
			Element root = document.getDocumentElement();
			/*System.out.println(root);
			System.out.println(root.getTextContent());
			System.out.println(root.getTagName());*/
						
			NodeList pharmlist = root.getElementsByTagName("item");
			
			//System.out.println(pharmlist.item(0).getNodeName());
			
			
			for (int i = 0; i < pharmlist.getLength(); i++) {
				Node node = pharmlist.item(i);
				//System.out.println("^^^^"+node.getTextContent());
				Element pharmelement = (Element)node;
				System.out.println("***************하위 엘리먼트의 값을 출력 *********");
				String addr = getText(pharmelement, "addr");
				String clCdNm = getText(pharmelement, "clCdNm");
				String emdongNm = getText(pharmelement, "emdongNm");
				String estbDd = getText(pharmelement, "estbDd");
				String postNo = getText(pharmelement, "postNo");
				String sgguCd = getText(pharmelement, "sgguCd");
				String sgguCdNm = getText(pharmelement, "sgguCdNm");
				String sidoCdNm = getText(pharmelement, "sidoCdNm");
				String telno = getText(pharmelement, "telno");
				String XPos = getText(pharmelement, "XPos");
				String YPos = getText(pharmelement, "YPos");
				String yadmNm = getText(pharmelement, "yadmNm");
				System.out.println(addr+"\n"+clCdNm+"\n"+emdongNm+"\n"
						+estbDd+"\n"+postNo+"\n"+sgguCd+"\n"
						+sgguCdNm+"\n"+sidoCdNm+"\n"+telno+"\n"+XPos
						+"\n"+YPos+"\n"+yadmNm)
						;
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		//System.out.println(list);
	}

	

	private static String getText(Element child, String tagName) {
		String nodevValue = "";
		Node node = child.getElementsByTagName(tagName).item(0);
		nodevValue = node.getChildNodes().item(0).getNodeValue();
		//System.out.println(node.getNodeName()+":"+nodevValue);
		return nodevValue;
	}




}
