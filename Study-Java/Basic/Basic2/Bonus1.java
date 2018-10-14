import java.util.Scanner;
public class Bonus1 {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("식을 입력하세요>>");
		
		double op1 = Scanner.nextDouble();
		
		String Operator = Scanner.next();
		
		double op2 = Scanner.nextDouble();
		
		double result = 0;
		
		switch(Operator) {
		case "+" : result = op1 + op2; break;
		case "-" : result = op1 - op2; break;
		case "*" : result = op1 * op2; break;
		case "/" :
			if(op2==0) {
	    		System.out.println("0으로 나눌 수 없습니다.");
	    		return;
	    	}
	    	result = op1 / op2 ; 
	    	break;
	    default : System.out.println("연산기호가 잘못되었습니다.");
	    	}
	    System.out.println("연산결과 "+result);
		}
		

	}


