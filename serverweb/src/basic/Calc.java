package basic;

public class Calc {
	public int calc(int num1,int num2,String opr){
		int result = 0;//�������� ������ ����
		switch(opr){
			case "+":
				result = num1+ num2;
				break;
			case "-":
				result = num1- num2;
				break;
			case "*":
				result = num1* num2;
				break;
			case "/":
				result = num1/ num2;
				break;
			default:
				System.out.println("�߸��Է�");
				System.exit(0);//���α׷��� ���� �����϶�� �ǹ�
		}
		return result;
	}
}
