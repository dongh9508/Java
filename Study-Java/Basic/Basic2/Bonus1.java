import java.util.Scanner;
public class Bonus1 {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���>>");
		
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
	    		System.out.println("0���� ���� �� �����ϴ�.");
	    		return;
	    	}
	    	result = op1 / op2 ; 
	    	break;
	    default : System.out.println("�����ȣ�� �߸��Ǿ����ϴ�.");
	    	}
	    System.out.println("������ "+result);
		}
		

	}


