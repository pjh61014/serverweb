package basic;

public class Calc {
	public int calc(int num1,int num2,String opr){
		int result = 0;//연산결과를 저장할 변수
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
				System.out.println("잘못입력");
				System.exit(0);//프로그램을 정상 종료하라는 의미
		}
		return result;
	}
}
