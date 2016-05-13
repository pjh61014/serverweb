package openapi;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import dept.dto.MyDeptDTO;

public class DomParserTest01 {

	public static void main(String[] args) {
	//1.DocumentBuilder�� �̿��ؼ� parsing�� ���̹Ƿ� DocumentBuilder�� 
	//������ִ� DocumentBuilderFactory�� ���� �����Ѵ�.
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//�Ľ��� �����͸� �����ϱ� ���� ��ü 
		ArrayList<MyDeptDTO> list = new ArrayList<MyDeptDTO>();
		try {
			//2. xml������ �Ľ��� �� �ִ� ����� �����ϴ� DocumentBuilder ���� 
			DocumentBuilder dombuilder = factory.newDocumentBuilder();
			//3. xml������ �Ľ� - �����̳� InputStream���·� �����ϴ� ���� �Ϲ��� 
			Document document = dombuilder.parse("src/openapi/dept.xml");
			//System.out.println(document);
			//4 root��带 ���ϱ� 
			Element root = document.getDocumentElement();
			//System.out.println(root.getTagName()+","+root.getNodeName());
			//5. root����� �ڽĳ�带 ���ϱ�
			NodeList nodelist = root.getChildNodes();
			NodeList deptlist =root.getElementsByTagName("dept");
			//System.out.println(nodelist.getLength()+","+deptlist.getLength());
			//System.out.println(deptlist.item(0).getNodeName());
			
			//6.NodelistŽ��
			for (int i = 0; i < deptlist.getLength(); i++) {
				Node node =deptlist.item(i);
				//System.out.println("^^^^"+node.getTextContent());
				//node�� �Ӽ��� �Ӽ� ���� Ž�� 
				printAttInfo(node);
				Element deptelement = (Element)node;
				System.out.println("***************���� ������Ʈ�� ���� ��� *********");
				String code = getText(deptelement, "code");
				String name = getText(deptelement, "name");
				String loc = getText(deptelement, "loc");
				String tel = getText(deptelement, "tel");
				MyDeptDTO dept = new MyDeptDTO(code, name, loc, tel);
				list.add(dept);
				
				
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void printAttInfo(Node node) {
		NamedNodeMap attMap = node.getAttributes();
		System.out.println("�� ����� �Ӽ��� ���� =>"+attMap.getLength());
		Node attrNode= attMap.item(0);
		System.out.println("�Ӽ���:"+attrNode.getNodeName());
		System.out.println("�Ӽ���:"+attrNode.getNodeValue());
		
	}
	//���ϴ� node�� value�� �����ϱ� ���� �޼ҵ� 
	public static String getText(Element child, String tagName){
		String nodevValue = "";
		//tagName�� �ش��ϴ� Nodelist���� ù ��° node�� ���ϱ� 
		Node node = child.getElementsByTagName(tagName).item(0);
		//ex) ù��° code����� ù��° �ڽĳ���� nodeValue���ϱ� 
		nodevValue = node.getChildNodes().item(0).getNodeValue();
		System.out.println(node.getNodeName()+":"+nodevValue);
		return nodevValue;
	}

}
